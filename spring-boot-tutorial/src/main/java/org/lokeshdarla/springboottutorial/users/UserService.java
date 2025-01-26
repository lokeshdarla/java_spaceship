package org.lokeshdarla.springboottutorial.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<UserModel> getAllUsers(){
        return this.userRepository.findAll();
    }

    public UserModel getUserById(String id){
        return this.userRepository.findById(id).orElse(null);
    }


    public UserModel saveUser(UserModel user) {
        return this.userRepository.save(user);
    }

    public void deleteUser(String id) {
        this.userRepository.deleteById(id);
    }


}
