package com.hindustaniBhau.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userservice;

    @PostMapping("/add")
    public String addUser(@RequestBody User user){
        return userservice.addUser(user);
    }
    @GetMapping("/get_users")
    public List<User> getUsers(){
        return userservice.getUsers();
    }
    @GetMapping("/get_user")
    public User getUser(@RequestParam("id") int id){
        return userservice.getUser(id);
    }

    }




