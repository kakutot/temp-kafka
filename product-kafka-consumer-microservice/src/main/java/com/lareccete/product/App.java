package com.lareccete.product;

import com.lareccete.product.kafka.KafkaProductEventConsumer;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@SpringBootApplication(scanBasePackages = {"com.lareccete.product.kafka",
    "com.lareccete.product.model", "com.lareccete.product.repo"})
public class App {

    public static void main(String args[]) {
        SpringApplication.run(App.class);
    }

    @Bean
    public CommandLineRunner commandLineRunner(
            @Qualifier(value = "createRecipeConsumer") KafkaProductEventConsumer createKafkaRecipeEvent,
            @Qualifier(value = "updateRecipeConsumer") KafkaProductEventConsumer updateKafkaRecipeEvent,
            @Qualifier(value = "deleteRecipeConsumer") KafkaProductEventConsumer deleteKafkaRecipeEvent) {

        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                ExecutorService executorService = Executors.newCachedThreadPool();
                executorService.execute(createKafkaRecipeEvent::startConsume);
                executorService.execute(updateKafkaRecipeEvent::startConsume);
                executorService.execute(deleteKafkaRecipeEvent::startConsume);
            }
        };
    }
}
