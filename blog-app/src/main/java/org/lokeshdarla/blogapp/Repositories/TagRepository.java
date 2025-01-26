package org.lokeshdarla.blogapp.Repositories;

import org.lokeshdarla.blogapp.Models.Tag;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TagRepository extends MongoRepository<Tag, String> {

}
