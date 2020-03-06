package test.repo;

import test.model.elastic.Recipe;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface RecipeRepository extends ElasticsearchRepository<Recipe, String> {
}