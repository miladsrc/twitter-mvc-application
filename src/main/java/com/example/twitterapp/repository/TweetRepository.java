package com.example.twitterapp.repository;

import com.example.twitterapp.entity.Tweet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TweetRepository extends JpaRepository<Long, Tweet> {


    void ()
}
