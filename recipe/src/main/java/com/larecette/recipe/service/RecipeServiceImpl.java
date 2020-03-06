package com.larecette.recipe.service;

import com.larecette.recipe.dto.*;
import com.larecette.recipe.kafka.EventType;
import com.larecette.recipe.kafka.KafkaRecipeEvent;
import com.larecette.recipe.kafka.KafkaRecipeEventProducer;
import com.larecette.recipe.kafka.RecipeKafka;
import com.larecette.recipe.mapper.IngredientMapper;
import com.larecette.recipe.mapper.RecipeMapper;
import com.larecette.recipe.model.IngredientSpanner;
import com.larecette.recipe.model.RecipeSpanner;
import com.larecette.recipe.repos.IngredientRepository;
import com.larecette.recipe.repos.RecipeSpannerRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Slf4j
@Component
public class RecipeServiceImpl implements RecipeService {

    @Autowired
    private RecipeSpannerRepository recipeSpannerRepository;

    @Autowired
    private IngredientRepository ingredientRepository;

    @Autowired
    private RecipeMapper recipeMapper;

    @Autowired
    private IngredientMapper ingredientMapper;

    @Lazy
    @Autowired
    private KafkaRecipeEventProducer kafkaRecipeEventProducer;

    @Override
    public RecipeOutDto getRecipeDtoById(UUID recipeId) {
        RecipeSpanner recipeSpanner = recipeSpannerRepository.findByRecipeId(recipeId);
        return recipeMapper.convertToRecipeQueryDto(recipeSpanner);
    }

    @Override
    public List<RecipeOutDto> getAllRecipe() {
        List<RecipeSpanner> recipeSpannerList = recipeSpannerRepository.findAll();
        return recipeSpannerList.stream().map(recipeMapper::convertToRecipeQueryDto).collect(Collectors.toList());
    }

    @Override
    @Transactional
    public RecipeOutDto createRecipe(RecipeInsideDto recipeInsideDto) {
        RecipeSpanner recipeSpanner = recipeMapper.convertToRecipeEntity(recipeInsideDto);
        recipeSpanner.setDifficulty(calculateDifficulty());
        recipeSpanner.setCalories(calculateCalories());

        RecipeSpanner recipeSpannerNew = recipeSpannerRepository.saveAndFlush(recipeSpanner);

        List<IngredientSpanner> ingredientSpannerList = recipeInsideDto.getIngredientList().stream().map(ingredientMapper::convertToIngredientEntity).collect(Collectors.toList());
        ingredientSpannerList.forEach(ingredient -> ingredient.setRecipeId(recipeSpannerNew.getRecipeId().toString()));
        ingredientRepository.saveAll(ingredientSpannerList);
        recipeSpannerNew.setIngredientSpannerList(ingredientSpannerList);

        RecipeOutDto recipeOutDto = recipeMapper.convertToRecipeQueryDto(recipeSpannerNew);
        sendEventToKafka(recipeOutDto, EventType.CREATE);

        return recipeOutDto;
    }

    @Override
    @Transactional
    public RecipeOutDto updateRecipe(RecipeInsideDto recipeInsideDto, UUID recipeId) {
        RecipeSpanner recipeSpannerFromDB = recipeSpannerRepository.findById(recipeId).orElse(null);
        if (recipeSpannerFromDB == null) {
            return null;
        }
        ingredientRepository.deleteAllByRecipeId(recipeId.toString());

        List<IngredientSpanner> ingredientSpannerList = recipeInsideDto.getIngredientList().stream().map(ingredientMapper::convertToIngredientEntity).collect(Collectors.toList());
        ingredientSpannerList.forEach(ingredient -> ingredient.setRecipeId(recipeSpannerFromDB.getRecipeId().toString()));
        ingredientRepository.saveAll(ingredientSpannerList);

        recipeSpannerFromDB.setRecipeName(recipeInsideDto.getRecipeName());
        recipeSpannerFromDB.setDescription(recipeInsideDto.getDescription());
        recipeSpannerFromDB.setTime(recipeInsideDto.getTime());
        recipeSpannerFromDB.setCuisine(recipeInsideDto.getCuisine());
        recipeSpannerFromDB.setIngredientSpannerList(ingredientSpannerList);

        RecipeOutDto recipeOutDto = recipeMapper.convertToRecipeQueryDto(recipeSpannerRepository.save(recipeSpannerFromDB));
        sendEventToKafka(recipeOutDto, EventType.UPDATE);

        return recipeOutDto;
    }

    @Override
    public Boolean deleteRecipe(UUID recipeId) {
        Boolean exists = recipeSpannerRepository.existsById(recipeId);
        if (exists) {
            RecipeSpanner recipeSpanner = recipeSpannerRepository.findByRecipeId(recipeId);
            RecipeOutDto recipeOutDto = recipeMapper.convertToRecipeQueryDto(recipeSpanner);
            recipeSpannerRepository.deleteById(recipeId);
            sendEventToKafka(recipeOutDto, EventType.DELETE);
        }
        return exists;
    }

    private Double calculateCalories() {
        return (double) (1 + (int) (Math.random() * 300));
    }

    private Integer calculateDifficulty() {
        return 1 + (int) (Math.random() * 5);
    }

    @Async
    void sendEventToKafka(RecipeOutDto recipeOutDto, EventType eventType) {
        final KafkaRecipeEvent kafkaRecipeEvent = new KafkaRecipeEvent(RecipeKafka.fromDto(recipeOutDto), eventType);
        kafkaRecipeEventProducer.send(kafkaRecipeEvent);
    }
}
