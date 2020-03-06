package com.lareccete.product.kafka;

import io.confluent.kafka.serializers.AbstractKafkaAvroSerDeConfig;
import io.confluent.kafka.serializers.KafkaAvroDeserializer;
import io.confluent.kafka.serializers.KafkaAvroDeserializerConfig;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Properties;

@Configuration
public class KafkaConsumerConfig {
    private Properties getProps() {
        final Properties props = new Properties();
        props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
        props.put(ConsumerConfig.ENABLE_AUTO_COMMIT_CONFIG, "true");
        props.put(ConsumerConfig.MAX_POLL_INTERVAL_MS_CONFIG, "1000");
        props.put(ConsumerConfig.GROUP_ID_CONFIG, "native-consumer-group");
        props.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "latest");
        props.put(AbstractKafkaAvroSerDeConfig.SCHEMA_REGISTRY_URL_CONFIG, "http://localhost:8081");
        props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
        props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, KafkaAvroDeserializer.class);
        props.put(KafkaAvroDeserializerConfig.SPECIFIC_AVRO_READER_CONFIG, true);

        return props;
    }

    @Bean
    @Qualifier("createProductConsumer")
    public KafkaProductEventConsumer createRecipeConsumer () {
        return new KafkaProductEventConsumer(getProps(), EventType.CREATE);
    }

    @Bean
    @Qualifier("deleteProductConsumer")
    public KafkaProductEventConsumer deleteRecipeConsumer () {
        return new KafkaProductEventConsumer(getProps(), EventType.DELETE);
    }

    @Bean
    @Qualifier("updateProductConsumer")
    public KafkaProductEventConsumer updateRecipeConsumer () {
        return new KafkaProductEventConsumer(getProps(), EventType.UPDATE);
    }

}
