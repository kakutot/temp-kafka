package com.larecette.recipe.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.larecette.recipe.model.IngredientElastic;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.elasticsearch.annotations.Document;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@Document(indexName = "recipes", type = "recipe")
public class RecipeElastic {
    @Id
    private UUID id;

    private UUID recipeId;

    @NotNull
    private String recipeName;

    @NotNull
    private String description;

    @NotNull
    private Integer time;

    @NotNull
    private Integer difficulty;

    @NotNull
    private String cuisine;

    @NotNull
    private Double calories;

   // @Field(type = FieldType.Nested, includeInParent = true)
    private List<IngredientElastic> ingredientList = new ArrayList<>();

}
