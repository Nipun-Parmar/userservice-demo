package com.example.demo.controllers;

import com.example.demo.dtos.SignUpRequestDto;
import com.example.demo.models.User;
import com.example.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;
    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }

    public User login(){
        return null;
    }

    @PostMapping("/")
    public User signUp(SignUpRequestDto requestDto){
        String name = requestDto.getName();
        String email = requestDto.getEmail();
        String password = requestDto.getPassword();
        return userService.signUp(name,email,password);
        //return null;
    }

    public ResponseEntity<Void> logout(){
        return null;
    }

}
