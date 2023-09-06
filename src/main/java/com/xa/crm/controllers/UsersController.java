package com.xa.crm.controllers;
//<editor-fold defaultstate="collapsed"  desc="imports">  

import com.xa.crm.models.DimUser;
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
    private Environment env;
    //</editor-fold>    


    public UsersController() { }


    @CrossOrigin("*")
    @PutMapping(value = "add", consumes = MediaType.APPLICATION_JSON)
    public @ResponseBody Integer add(@RequestParam("user") DimUser user) throws IOException {
        logger.info("");
        try {







        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return 1;
    }






    @CrossOrigin("*")
    @PutMapping(value = "edit", consumes = MediaType.APPLICATION_JSON)
    public @ResponseBody Integer edit(@RequestParam("className") String className
            , @RequestBody String st , @RequestParam String userIDRequested) throws IOException, ClassNotFoundException {
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
