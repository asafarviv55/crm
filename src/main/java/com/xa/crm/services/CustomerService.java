package com.xa.crm.services;

import com.xa.crm.models.Customer;
import com.xa.crm.models.User;
import com.xa.crm.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {


    @Autowired
    CustomerRepository customerRepository;



    public List<Customer> getAllUsers() {
        return customerRepository.findAll();
    }

    public Optional<Customer> getUserById(int id) {
        return customerRepository.findById(id);
    }

    public void deleteUserById(int id) {
        try {
            customerRepository.deleteById(id);
        }catch (Exception e ){
            e.printStackTrace();
        }
    }

    public void deleteAllUsers(int id) {
        customerRepository.deleteAll();
    }


    public void saveUser(Customer customer) {
        try {
            customerRepository.save(customer);
        }
        catch(Exception e ){
            e.printStackTrace();
        }
    }




}
