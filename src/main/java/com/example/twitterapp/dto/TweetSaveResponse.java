package com.example.twitterapp.dto;

import com.example.twitterapp.entity.User;

import java.time.LocalDateTime;

public record TweetSaveResponse(String content, User user, LocalDateTime registeredDate) {
}
