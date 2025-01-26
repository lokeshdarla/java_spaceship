package org.lokeshdarla.blogapp.Repositories;

import org.lokeshdarla.blogapp.Models.Category;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CategoryRepository extends MongoRepository<Category, String> {
}
