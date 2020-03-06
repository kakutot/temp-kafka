package com.larecette.recipe.mapper;

import com.larecette.recipe.dto.IngredientInsideDto;
import com.larecette.recipe.dto.IngredientOutDto;
import com.larecette.recipe.model.IngredientSpanner;
import org.springframework.stereotype.Component;

@Component
public class IngredientMapper {
    public IngredientOutDto convertToIngredientDto(IngredientSpanner ingredientSpanner) {
        IngredientOutDto ingredientOutDto = new IngredientOutDto();
        ingredientOutDto.setIngredientId(ingredientSpanner.getIngredientId());
        ingredientOutDto.setRecipeId(ingredientSpanner.getRecipeId());
        ingredientOutDto.setProductId(ingredientSpanner.getProductId());
        ingredientOutDto.setName(ingredientSpanner.getName());
        ingredientOutDto.setMeasureUnit(ingredientSpanner.getMeasureUnit());
        ingredientOutDto.setCalories(ingredientSpanner.getCalories());
        ingredientOutDto.setAmount(ingredientSpanner.getAmount());
        return ingredientOutDto;
    }

    public IngredientSpanner convertToIngredientEntity(IngredientInsideDto ingredientInsideDto) {
        IngredientSpanner ingredientSpanner = new IngredientSpanner();
        ingredientSpanner.setProductId(ingredientInsideDto.getProductId());
        ingredientSpanner.setName(ingredientInsideDto.getName());
        ingredientSpanner.setMeasureUnit(ingredientInsideDto.getMeasureUnit());
        ingredientSpanner.setCalories(ingredientInsideDto.getCalories());
        ingredientSpanner.setAmount(ingredientInsideDto.getAmount());
        return ingredientSpanner;
    }
}

