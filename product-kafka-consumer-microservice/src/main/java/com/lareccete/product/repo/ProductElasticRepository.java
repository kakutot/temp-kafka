package com.lareccete.product.repo;

import com.lareccete.product.model.Product;
import org.springframework.data.elasticsearch.repository.ElasticsearchCrudRepository;

import java.util.UUID;

public interface ProductElasticRepository extends ElasticsearchCrudRepository<Product, UUID> {
}
