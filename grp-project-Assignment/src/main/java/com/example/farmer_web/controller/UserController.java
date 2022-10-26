package com.example.farmer_web.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
@CrossOrigin

public class UserController {

    @GetMapping("/getUser")
    public String getUser(){
        return "GetUser";
    }

    @PostMapping("/saveUser")
    public String saveUser(){
        return "SaveUser";
    }

    @PutMapping("/updateUser")
    public String updateUser(){
        return "Update";
    }

    @DeleteMapping("/deleteUser")
    public String deleteUser(){
        return "Delete User";
    }
}
