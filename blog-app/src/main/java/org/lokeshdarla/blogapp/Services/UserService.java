package org.lokeshdarla.blogapp.Services;

import org.lokeshdarla.blogapp.Models.UserModel;
import org.lokeshdarla.blogapp.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public List<UserModel> getAllUser(){
        return this.userRepository.findAll();
    }

    public UserModel  getUserById(String Id){
        return this.userRepository.findById(Id).orElse(null);
    }

    public UserModel saveUser(UserModel user){
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return this.userRepository.save(user);
    }

    public void deleteUserById(String Id){
        this.userRepository.deleteById(Id);
    }

}
