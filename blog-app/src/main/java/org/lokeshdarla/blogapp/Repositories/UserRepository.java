package org.lokeshdarla.blogapp.Repositories;

import org.lokeshdarla.blogapp.Models.UserModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<UserModel,String> {
}
