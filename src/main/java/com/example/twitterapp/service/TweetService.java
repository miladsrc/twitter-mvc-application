package com.example.twitterapp.service;

import com.example.twitterapp.entity.Tweet;
import com.example.twitterapp.repository.TweetRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TweetService {

    private TweetRepository tweetRepository;

    public void addLikeToTweet(Tweet tweet) {
        Long value ;
        if (tweetRepository.tweetExistById(tweet.getId())){
            value = tweetRepository.getLikes(tweet.getId());
            value+=1;
            tweetRepository.addToLikes(tweet.getId(), value);
        }
        new RuntimeException("tweet not exist");
    }


    public Tweet saveTweet(Tweet tweet){
        return tweetRepository.save(tweet);
    }

}
