package com.larecette.product.command.kafka;

import com.larecette.product.command.model.Product;
import com.larecette.product.command.repository.ProductRepository;
import com.larecette.product.command.temp.EventType;
import com.larecette.product.command.temp.KafkaProductEvent;
import com.larecette.product.command.temp.ProductKafka;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PreDestroy;
import java.util.Objects;
import java.util.Properties;
import java.util.UUID;

@Slf4j
public class KafkaProductEventProducer extends KafkaProducer<String, KafkaProductEvent> {
    @Autowired
    private ProductRepository productRepository;
    private final static String TOPIC_NAME = "TOPIC_PRODUCTS";

    public KafkaProductEventProducer(Properties properties) {
        super(properties);
    }

    public void send(KafkaProductEvent kafkaProductEvent) {
        if (kafkaProductEvent.getEventType().equals(EventType.DELETE)) {
            Objects.requireNonNull(kafkaProductEvent.getProductKafka());
            Product product = productRepository.findById(
                    UUID.fromString(kafkaProductEvent.getProductKafka().getId())).get();
            kafkaProductEvent.setProductKafka(ProductKafka.fromProduct(product));
        }
        final ProducerRecord<String, KafkaProductEvent> kafkaProductEventProducerRecord =
                new ProducerRecord(TOPIC_NAME,
                        kafkaProductEvent.getEventType().name(),
                        kafkaProductEvent);
            send(kafkaProductEventProducerRecord);
            flush();
            log.info("Successfully produced message to a topic called {}", TOPIC_NAME);
    }

    @PreDestroy
    public void onDestroy() {
        close();
    }

}
