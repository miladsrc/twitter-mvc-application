package com.example.twitterapp.controller;


import com.example.twitterapp.dto.UserSaveResponse;
import com.example.twitterapp.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {


    private final  UserService userService;


    @PostMapping("/save")
    public ResponseEntity<UserSaveResponse>
}
