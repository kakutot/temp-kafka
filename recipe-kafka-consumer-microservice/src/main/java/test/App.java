package test;

import test.kafka.product.KafkaProductEventConsumer;
import test.kafka.recipe.KafkaRecipeEventConsumer;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@SpringBootApplication(scanBasePackages = "test.kafka")
public class App {

    public static void main(String args[]) {
        SpringApplication.run(App.class);
    }

    @Bean
    public CommandLineRunner commandLineRunner(
            @Qualifier(value = "createRecipeConsumer") KafkaRecipeEventConsumer createKafkaRecipeEvent,
            @Qualifier(value = "updateRecipeConsumer") KafkaRecipeEventConsumer updateKafkaRecipeEvent,
            @Qualifier(value = "deleteRecipeConsumer") KafkaRecipeEventConsumer deleteKafkaRecipeEvent,
            @Qualifier(value = "createProductConsumer") KafkaProductEventConsumer createKafkaProductEvent,
            @Qualifier(value = "updateProductConsumer") KafkaProductEventConsumer updateKafkaProductEvent,
            @Qualifier(value = "deleteProductConsumer") KafkaProductEventConsumer deleteKafkaProductEvent) {

        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                ExecutorService executorService = Executors.newCachedThreadPool();
                executorService.execute(createKafkaRecipeEvent::startConsume);
                executorService.execute(updateKafkaRecipeEvent::startConsume);
                executorService.execute(deleteKafkaRecipeEvent::startConsume);
                executorService.execute(createKafkaProductEvent::startConsume);
                executorService.execute(updateKafkaProductEvent::startConsume);
                executorService.execute(deleteKafkaProductEvent::startConsume);
            }
        };
    }
}
