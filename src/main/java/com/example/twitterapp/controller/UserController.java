package com.example.twitterapp.controller;


import com.example.twitterapp.dto.UserSaveRequest;
import com.example.twitterapp.dto.UserSaveResponse;
import com.example.twitterapp.entity.User;
import com.example.twitterapp.mapper.UserMapper;
import com.example.twitterapp.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {


    private final  UserService userService;


    @PostMapping("/save")
    public ResponseEntity<UserSaveResponse> saveUser(@RequestBody UserSaveRequest userSaveRequest) {
        User user = UserMapper.INSTANCE.userSaveRequestToModel(userSaveRequest);
        User savedUser = userService.saveUser(user);
        UserSaveResponse userSaveResponse = UserMapper.INSTANCE.modelToUserSaveResponse(savedUser);
        return new ResponseEntity<>(userSaveResponse, HttpStatus.CREATED);
    }
}
