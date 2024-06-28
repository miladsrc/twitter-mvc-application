package com.example.twitterapp.service;

import com.example.twitterapp.entity.User;
import com.example.twitterapp.exception.DuplicateException;
import com.example.twitterapp.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private UserRepository userRepository;


    public User saveUser(User user) {
        userRepository.findUserByUsername(user.getUsername())
                .ifPresent(s -> {
                    throw new DuplicateException("User " + user.getUsername() + " already exists");
                });
        return userRepository.save(user);
    }


    public void updateUserPasswordByUsername(String username, String oldPassword, String newPassword) {
        if(oldPassword != newPassword) throw new RuntimeException("Password are not the same!");
        userRepository.updatePasswordByUsername(username, oldPassword, newPassword);
    }


    public User LoginByUsernameAndPassword(String username, String password){
        return userRepository.findUserByUsernameAndPassword(username, password )
                .orElseThrow(() -> new RuntimeException("not found"));
    }



}
