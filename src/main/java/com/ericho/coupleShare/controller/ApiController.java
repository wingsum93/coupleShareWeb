package com.ericho.coupleShare.controller;

import com.ericho.coupleShare.exception.JException;
import com.ericho.coupleShare.model.User;
import com.ericho.coupleShare.rest.BaseSingleResponse;
import com.ericho.coupleShare.service.ProductService;
import com.ericho.coupleShare.service.UserService;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.google.gson.Gson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.annotation.MultipartConfig;

@Controller
@RequestMapping("/api")
public class ApiController {
    Logger log = LoggerFactory.getLogger(ApiController.class);
    private Gson gson = new Gson();
    @Autowired
    private UserService userService;

    @Autowired
    private ProductService productService;
    
    
    //              for properties
//    @Value("#{systemProperties.myProp}")
    private String filePath;
    
    
    
    
    
    //-----------------------------------------------------------------------------


    @RequestMapping("/register")
    @ResponseBody
    public BaseSingleResponse<String> registerUser(@RequestParam() String username,
                                                   @RequestParam() String password) {
        BaseSingleResponse<String> response = new BaseSingleResponse<>();

        log.debug("username " + username + " password=" + password);
        try {
            userService.register(username, password);
            boolean authenticate = true;
            response.setStatus(authenticate);
            response.setExtra("extra");
            log.debug(gson.toJson(response));
            return response;
        } catch (Exception e) {
            response.setStatus(false);
            response.setErrorMessage(e.getMessage());
            log.warn(gson.toJson(response));
            return response;
        }
    }

    @PostMapping("/login")
    @ResponseBody
    public BaseSingleResponse<Void> checkLogin(
            @RequestParam() String username,
            @RequestParam() String password) {
        log.debug("login  username= " + username);

        BaseSingleResponse<Void> response = new BaseSingleResponse<>();
        try {

            boolean authenticate = userService.checkLogin(username, password);
            ;
            response.setStatus(authenticate);
            log.debug(gson.toJson(response));
            return response;
        } catch (Exception e) {
            response.setStatus(false);
            response.setErrorMessage(e.getMessage());
            log.warn(gson.toJson(response));
            return response;
        }
    }

    @RequestMapping("/changePassword")
    @ResponseBody
    public BaseSingleResponse<Void> changePassword() {
        boolean authenticate = true;

        BaseSingleResponse<Void> response = new BaseSingleResponse<>();
        response.setStatus(authenticate);
        return response;
    }



    @RequestMapping(path = "/uploadPhoto",method = RequestMethod.POST)
    @ResponseBody
    public BaseSingleResponse<String> changePassword(
            @RequestHeader("token") String token,
            @RequestParam("photo") MultipartFile multipartFile,
            @RequestParam("tags") String tags
            ) {

        BaseSingleResponse<String> response = new BaseSingleResponse<>();
        try {

            boolean authenticate = true;
            ;
            response.setStatus(authenticate);
            log.debug(gson.toJson(response));
            return response;
        } catch (Exception e) {
            response.setStatus(false);
            response.setErrorMessage(e.getMessage());
            log.warn(gson.toJson(response));
            return response;
        }
    }
}
