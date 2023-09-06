package com.xa.crm.services;

import com.xa.crm.models.DimUser;
import com.xa.crm.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {


    @Autowired
    UserRepository userRepository;

    public List<DimUser> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<DimUser> getUserById(int id) {
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


    public void saveUser(DimUser dimUser) {
        try {
            userRepository.save(dimUser);
        }
        catch(Exception e ){
            e.printStackTrace();
        }
    }






}
