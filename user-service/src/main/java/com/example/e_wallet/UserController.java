package com.example.e_wallet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/user")
    public void createUser(@RequestBody @Valid UserCreateRequest userCreateRequest){

    }

    @GetMapping("/user")
    public User getUser(@RequestParam("userId") int id){

    }
}
