package com.ericho.fyp.controller;

import com.ericho.fyp.model.User;
import com.ericho.fyp.rest.BaseSingleResponse;
import com.ericho.fyp.service.ProductService;
import com.ericho.fyp.service.UserService;
import org.apache.commons.logging.Log;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.ericho.fyp.dao.UserDao;

@Controller
@RequestMapping("/api")
public class ApiController {
    Logger log = LoggerFactory.getLogger(ApiController.class);
    @Autowired
    private UserService userService;

    @Autowired
    private ProductService productService;
    //-----------------------------------------------------------------------------


    @RequestMapping("/register")
    @ResponseBody
    public BaseSingleResponse<Void> registerUser(@RequestBody User user) {
        boolean authenticate = true;

        BaseSingleResponse<Void> response = new BaseSingleResponse<>();
        response.setStatus(authenticate);
        return response;
    }

    @PostMapping("/login")
    @ResponseBody
    public BaseSingleResponse<Void> checkLogin(
            @RequestParam() String username,
            @RequestParam() String password
    ) {
        log.debug("login  username= " + username);

        boolean authenticate = true;

        BaseSingleResponse<Void> response = new BaseSingleResponse<>();
        response.setStatus(authenticate);
        return response;
    }

    @RequestMapping("/changePassword")
    @ResponseBody
    public BaseSingleResponse<Void> changePassword() {
        boolean authenticate = true;

        BaseSingleResponse<Void> response = new BaseSingleResponse<>();
        response.setStatus(authenticate);
        return response;
    }
}
