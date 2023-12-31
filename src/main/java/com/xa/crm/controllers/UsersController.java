package com.xa.crm.controllers;
//<editor-fold defaultstate="collapsed"  desc="imports">  

import com.xa.crm.models.User;
import com.xa.crm.services.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.core.MediaType;
import java.io.IOException;



@RestController
@RequestMapping("users")
public class UsersController {

    private static final Logger logger = LoggerFactory.getLogger(UsersController.class);


    @Autowired
    UserService userService;



    public UsersController() { }


    @CrossOrigin("*")
    @PutMapping(value = "addUser", consumes = MediaType.APPLICATION_JSON)
    public @ResponseBody Integer add(@RequestParam("user") User user) throws IOException {
        logger.info("addUser ");
        try {
            userService.saveUser(user);
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
    @PutMapping(value = "editUser", consumes = MediaType.APPLICATION_JSON)
    public @ResponseBody Integer edit(@RequestParam("user") User user) throws IOException {
        logger.info(" editUser ");
        try {
            userService.saveUser(user);
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
