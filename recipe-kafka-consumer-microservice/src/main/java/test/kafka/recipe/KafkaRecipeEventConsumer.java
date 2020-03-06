package test.kafka.recipe;

import test.kafka.EventType;
import test.repo.RecipeRepository;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.TopicPartition;
import org.apache.kafka.common.errors.WakeupException;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collections;
import java.util.Properties;

@Slf4j
public class KafkaRecipeEventConsumer extends KafkaConsumer<String, KafkaRecipeEvent> {
    private final static String TOPIC_NAME = "TOPIC_RECIPES";
    private final static int MAX_NO_MESSAGE_FOUND_COUNT = 1000;

    @Autowired private RecipeRepository recipeRepository;

    private final EventType eventType;

    public KafkaRecipeEventConsumer(Properties properties, EventType eventType) {
        super(properties);
        this.eventType = eventType;
    }

    public void startConsume() {
        final Thread mainThread = Thread.currentThread();
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            KafkaRecipeEventConsumer.this.wakeup();
            try {
                mainThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }));

        try {
            this.assign(Collections.singletonList(new TopicPartition(TOPIC_NAME, eventType.ordinal())));
            while (true) {
                ConsumerRecords<String, KafkaRecipeEvent> records = this.poll(1000);
                int noMessageFound = 0;
                if (records.count() == 0) {
                    noMessageFound++;
                    if (noMessageFound > MAX_NO_MESSAGE_FOUND_COUNT) {
                        break;
                    }
                    continue;
                }
                for (ConsumerRecord<String, KafkaRecipeEvent> record : records) {
                    log.info("offset = {}, key = {}, value = {}\n", record.offset(), record.key(), record.value());
                    resolveAction(record.value().getRecipeKafka());
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

    private void resolveAction(RecipeKafka recipeKafka) {
        switch (eventType) {
            case CREATE: {
                recipeRepository.save(RecipeKafka.toElastic(recipeKafka));
                break;
            }
            case DELETE: {
                recipeRepository.deleteById(recipeKafka.getRecipeId());
                break;
            }
            case UPDATE: {
                recipeRepository.save(RecipeKafka.toElastic(recipeKafka));
                break;
            }
        }
    }

}
