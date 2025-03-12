package com.example.learning_gradle.repository;

import com.example.learning_gradle.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}