package test.kafka.product;

import test.kafka.EventType;
import test.repo.IngredientRepository;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.TopicPartition;
import org.apache.kafka.common.errors.WakeupException;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collections;
import java.util.Properties;
import java.util.UUID;

@Slf4j
public class KafkaProductEventConsumer extends KafkaConsumer<String, KafkaProductEvent> {
    private final static String TOPIC_NAME = "TOPIC_PRODUCTS";
    private final static int MAX_NO_MESSAGE_FOUND_COUNT = 1000;

    @Autowired private IngredientRepository ingredientRepository;

    private final EventType eventType;

    public KafkaProductEventConsumer(Properties properties, EventType eventType) {
        super(properties);
        this.eventType = eventType;
    }

    public void startConsume() {
        final Thread mainThread = Thread.currentThread();
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            KafkaProductEventConsumer.this.wakeup();
            try {
                mainThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }));

        try {
            this.assign(Collections.singletonList(new TopicPartition(TOPIC_NAME, eventType.ordinal())));
            while (true) {
                ConsumerRecords<String, KafkaProductEvent> records = this.poll(1000);
                int noMessageFound = 0;
                if (records.count() == 0) {
                    noMessageFound++;
                    if (noMessageFound > MAX_NO_MESSAGE_FOUND_COUNT) {
                        break;
                    }
                    continue;
                }
                for (ConsumerRecord<String, KafkaProductEvent> record : records) {
                    log.info("offset = {}, key = {}, value = {}\n", record.offset(), record.key(), record.value());
                    resolveAction(record.value().getProductKafka());
                    commitSync();
                }
            }
        } catch (WakeupException e) {
            // ignore for shutdown
        } finally {
            this.close();
            log.info("Closing consumer {}", getClass().getCanonicalName());
        }
    }

    private void resolveAction(ProductKafka productKafka) {
        switch (eventType) {
            case CREATE: {
                if (!ingredientRepository.existsById(UUID.fromString(productKafka.getId()))) {
                    ingredientRepository.save(ProductKafka.toIngredientSpanner(productKafka));
                }
                break;
            }
            case DELETE: {
                ingredientRepository.deleteById(UUID.fromString(productKafka.getId()));
                break;
            }
            case UPDATE: {
                ingredientRepository.save(ProductKafka.toIngredientSpanner(productKafka));
                break;
            }
        }
    }

}
