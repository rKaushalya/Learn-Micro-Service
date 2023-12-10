package com.example.demo.controller;

import com.example.demo.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@CrossOrigin
@RequestMapping("/user")
public class UserController {

    @Autowired
    private RestTemplate restTemplate;

    @PostMapping
    public String saveUser(){
        return restTemplate.getForObject("http://localhost:8082/order",String.class);
    }

    @PostMapping(path = "/check")
    public void checkUser(@RequestBody UserEntity user){
        restTemplate.postForObject("http://localhost:8082/order/editUser",user,UserEntity.class);
    }
}
