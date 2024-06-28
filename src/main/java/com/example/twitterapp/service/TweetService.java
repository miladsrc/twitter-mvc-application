package com.example.twitterapp.service;

import com.example.twitterapp.repository.TweetRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TweetService {

    private TweetRepository tweetRepository;
}
