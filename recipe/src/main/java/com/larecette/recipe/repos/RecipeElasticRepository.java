package com.larecette.recipe.repos;

import com.larecette.recipe.model.RecipeElastic;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;
import java.util.UUID;

public interface RecipeElasticRepository extends ElasticsearchRepository<RecipeElastic, UUID> {
    @Override
    List<RecipeElastic> findAll();
}
