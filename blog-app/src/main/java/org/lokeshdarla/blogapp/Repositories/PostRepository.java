package org.lokeshdarla.blogapp.Repositories;

import org.lokeshdarla.blogapp.Models.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post, String> {
}
