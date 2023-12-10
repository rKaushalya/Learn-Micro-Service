package com.example.orderservice.controller;

import com.example.orderservice.entity.UserEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
public class OrderController {
    @GetMapping
    public String getOrder(){
        return "Work New";
    }

    @PostMapping(path = "/editUser")
    public UserEntity editUSerAddress(@RequestBody UserEntity user){
        user.setUserName("Kaushalya");
        System.out.println("Test Passed : "+user.getUserName());
        return user;
    }
}
