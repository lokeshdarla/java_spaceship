package org.lokeshdarla.blogapp.Repositories;

import org.lokeshdarla.blogapp.Models.UserModel;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UserRepository extends MongoRepository<UserModel,String> {
    Optional<UserModel> findByUsername(String username);
}
