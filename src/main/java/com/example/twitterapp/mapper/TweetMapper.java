package com.example.twitterapp.mapper;

import com.example.twitterapp.dto.TweetSaveRequest;
import com.example.twitterapp.dto.TweetSaveResponse;
import com.example.twitterapp.entity.Tweet;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface TweetMapper {

    TweetMapper INSTANCE = Mappers.getMapper(TweetMapper.class);
    Tweet tweetSaveRequestToModel(TweetSaveRequest tweetSaveRequest);
    TweetSaveResponse modelToTweetSaveResponse(Tweet tweet);
}
