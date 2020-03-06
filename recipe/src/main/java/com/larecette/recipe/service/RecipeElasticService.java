package com.larecette.recipe.service;

import com.larecette.recipe.model.RecipeElastic;
import com.larecette.recipe.repos.RecipeElasticRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;

@Component
public class RecipeElasticService {
    @Autowired
    private final RecipeElasticRepository recipeElasticRepository;

    public RecipeElasticService(RecipeElasticRepository recipeElasticRepository) {
        this.recipeElasticRepository = recipeElasticRepository;
    }

    public RecipeElastic findById(UUID recipeId) {
        return recipeElasticRepository.findById(recipeId).orElse(null);
    }

    public List<RecipeElastic> findAll(){
        return recipeElasticRepository.findAll();
    }

    public RecipeElastic createRecipe(RecipeElastic recipeElastic){
        return recipeElasticRepository.save(recipeElastic);
    }

}
