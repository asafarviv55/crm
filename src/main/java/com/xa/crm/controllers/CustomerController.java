package com.xa.crm.controllers;


import com.xa.crm.models.Customer;
import com.xa.crm.models.User;
import com.xa.crm.services.CustomerService;
import com.xa.crm.services.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.core.MediaType;
import java.io.IOException;

@RestController
@RequestMapping("customers")
public class CustomerController {


    private static final Logger logger = LoggerFactory.getLogger(CustomerController.class);

    @Autowired
    CustomerService customerService;

    @CrossOrigin("*")
    @PutMapping(value = "addCustomer", consumes = MediaType.APPLICATION_JSON)
    public @ResponseBody Integer add(@RequestParam("customer") Customer customer) throws IOException {
        logger.info("addUser ");
        try {
            customerService.saveUser(customer);
        }
        catch(Exception e)
        {
            e.printStackTrace();
            logger.error(e.getMessage());
            return 0;
        }
        return 1;
    }






    @CrossOrigin("*")
    @PutMapping(value = "editCustomer", consumes = MediaType.APPLICATION_JSON)
    public @ResponseBody Integer edit(@RequestParam("customer") Customer customer) throws IOException {
        logger.info(" editCustomer ");
        try {
            customerService.saveUser(customer);
        }
        catch(Exception e)
        {
            e.printStackTrace();
            logger.error(e.getMessage());
            return 0;
        }
        return 1;
    }








}
