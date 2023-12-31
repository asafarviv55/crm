package com.xa.crm.services;

import com.xa.crm.models.User;
import com.xa.crm.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {


    @Autowired
    UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<User> getUserById(int id) {
        return userRepository.findById(id);
    }

    public void deleteUserById(int id) {
        try {
            userRepository.deleteById(id);
        }catch (Exception e ){
            e.printStackTrace();
        }
    }

    public void deleteAllUsers(int id) {
         userRepository.deleteAll();
    }


    public void saveUser(User user) {
        try {
            userRepository.save(user);
        }
        catch(Exception e ){
            e.printStackTrace();
        }
    }




}
