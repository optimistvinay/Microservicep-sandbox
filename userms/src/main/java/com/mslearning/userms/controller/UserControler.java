package com.mslearning.userms.controller;


import com.mslearning.userms.model.User;
import com.mslearning.userms.repository.UserRepository;
import com.mslearning.userms.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
public class UserControler {

    @Autowired
    private UserService userService;

    @GetMapping(path = "/users/orders")
    public Object getAllOrders() {
        log.info("$$$$$$$$$$$$$");
        log.info("Getting all orders from Orderms");

        return userService.getAllOrders();
    }

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/hello")
    public String getHello(){
        return "Hi!!!! Hello World!!!!";
    }


    @GetMapping("/users")
    public List<User> getUsers(){
        log.info("Getting the users");
        return userRepository.findAll();
    }

}
