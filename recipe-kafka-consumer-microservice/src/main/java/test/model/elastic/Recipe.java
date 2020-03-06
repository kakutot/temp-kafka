package test.model.elastic;

import test.model.spanner.Ingredient;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.UUID;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Document(indexName = "recipes", type = "recipe")
public class Recipe {
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

    @Field(type = FieldType.Nested)
    private List<Ingredient> ingredients;
}