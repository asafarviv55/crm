package com.xa.crm.controllers;
//<editor-fold defaultstate="collapsed"  desc="imports">  

import com.xa.crm.models.DimUser;
import com.xa.crm.services.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;
import java.io.IOException;

//</editor-fold>


@RestController
@RequestMapping("users")
public class UsersController {

    private static final Logger logger = LoggerFactory.getLogger(UsersController.class);


    @Autowired
    UserService userService;

    @Autowired
    private Environment env;
    //</editor-fold>    


    public UsersController() { }


    @CrossOrigin("*")
    @PutMapping(value = "addUser", consumes = MediaType.APPLICATION_JSON)
    public @ResponseBody Integer add(@RequestParam("user") DimUser user) throws IOException {
        logger.info("");
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
    public @ResponseBody Integer edit(@RequestParam("user") DimUser user) throws IOException {
        logger.info("");
        try {








        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return 1;
    }





}
