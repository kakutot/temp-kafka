package com.larecette.recipe;

import com.larecette.recipe.kafka.KafkaRecipeEvent;
import com.larecette.recipe.kafka.KafkaRecipeEventProducer;
import org.apache.avro.Schema;
import org.apache.avro.file.CodecFactory;
import org.apache.avro.file.DataFileWriter;
import org.apache.avro.io.DatumWriter;
import org.apache.avro.reflect.ReflectData;
import org.apache.avro.reflect.ReflectDatumWriter;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.File;

@SpringBootApplication
public class RecipeApplication  {

    public static void main(String[] args) {
        SpringApplication.run(RecipeApplication.class, args);
    }

}
