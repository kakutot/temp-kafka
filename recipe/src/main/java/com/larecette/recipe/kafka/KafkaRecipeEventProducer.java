package com.larecette.recipe.kafka;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;

import javax.annotation.PreDestroy;
import java.util.Properties;

@Slf4j
public class KafkaRecipeEventProducer extends KafkaProducer<String, KafkaRecipeEvent> {
    private final static String RECIPE_TOPIC = "TOPIC_RECIPES";

    public KafkaRecipeEventProducer(Properties properties) {
        super(properties);
    }

    public void send(KafkaRecipeEvent kafkaRecipeEvent) {
        final ProducerRecord<String, KafkaRecipeEvent> kafkaRecipeEventProducerRecord =
                new ProducerRecord<>(RECIPE_TOPIC,
                        kafkaRecipeEvent.getEventType().name(),
                        kafkaRecipeEvent);
            send(kafkaRecipeEventProducerRecord);
            flush();
            log.info("Successfully produced message to a topic called {}", RECIPE_TOPIC);
    }

    @PreDestroy
    public void onDestroy() {
        close();
    }

}
