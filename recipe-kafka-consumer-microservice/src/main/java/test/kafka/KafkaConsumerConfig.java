package test.kafka;

import org.springframework.context.annotation.Configuration;
import test.kafka.product.KafkaProductEventConsumer;
import test.kafka.recipe.KafkaRecipeEventConsumer;
import io.confluent.kafka.serializers.AbstractKafkaAvroSerDeConfig;
import io.confluent.kafka.serializers.KafkaAvroDeserializer;
import io.confluent.kafka.serializers.KafkaAvroDeserializerConfig;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;

import java.util.Properties;

@Configuration
public class KafkaConsumerConfig {
    private Properties getRecipeConsumerProps() {
        final Properties props = new Properties();
        props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
        props.put(ConsumerConfig.ENABLE_AUTO_COMMIT_CONFIG, "true");
        props.put(ConsumerConfig.MAX_POLL_INTERVAL_MS_CONFIG, "1000");
        props.put(ConsumerConfig.GROUP_ID_CONFIG, "default");
        props.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "latest");
        props.put(AbstractKafkaAvroSerDeConfig.SCHEMA_REGISTRY_URL_CONFIG, "http://localhost:8081");
        props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
        props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, KafkaAvroDeserializer.class);
        props.put(KafkaAvroDeserializerConfig.SPECIFIC_AVRO_READER_CONFIG, true);

        return props;
    }

    private Properties getProductConsumerProps() {
        final Properties props = new Properties();
        props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
        props.put(ConsumerConfig.ENABLE_AUTO_COMMIT_CONFIG, "true");
        props.put(ConsumerConfig.MAX_POLL_INTERVAL_MS_CONFIG, "1000");
        props.put(ConsumerConfig.GROUP_ID_CONFIG, "non-native-consumer");
        props.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "latest");
        props.put(AbstractKafkaAvroSerDeConfig.SCHEMA_REGISTRY_URL_CONFIG, "http://localhost:8081");
        props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
        props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, KafkaAvroDeserializer.class);
        props.put(KafkaAvroDeserializerConfig.SPECIFIC_AVRO_READER_CONFIG, true);

        return props;
    }

    @Bean
    @Qualifier("createRecipeConsumer")
    public KafkaRecipeEventConsumer createRecipeConsumer () {
        return new KafkaRecipeEventConsumer(getRecipeConsumerProps(), EventType.CREATE);
    }

    @Bean
    @Qualifier("deleteRecipeConsumer")
    public KafkaRecipeEventConsumer deleteRecipeConsumer () {
        return new KafkaRecipeEventConsumer(getRecipeConsumerProps(), EventType.DELETE);
    }

    @Bean
    @Qualifier("updateRecipeConsumer")
    public KafkaRecipeEventConsumer updateRecipeConsumer () {
        return new KafkaRecipeEventConsumer(getRecipeConsumerProps(), EventType.UPDATE);
    }

    ////Product

    @Bean
    @Qualifier("createProductConsumer")
    public KafkaProductEventConsumer createProductConsumer () {
        return new KafkaProductEventConsumer(getProductConsumerProps(), EventType.CREATE);
    }

    @Bean
    @Qualifier("deleteProductConsumer")
    public KafkaProductEventConsumer deleteProductConsumer () {
        return new KafkaProductEventConsumer(getProductConsumerProps(), EventType.DELETE);
    }

    @Bean
    @Qualifier("updateProductonsumer")
    public KafkaProductEventConsumer updateProductConsumer () {
        return new KafkaProductEventConsumer(getRecipeConsumerProps(), EventType.UPDATE);
    }

}
