package com.example.twitterapp.repository;

import com.example.twitterapp.entity.Tweet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface TweetRepository extends JpaRepository<Tweet, Long> {


    @Modifying
    @Query("SELECT Tweet.likes FROM Tweet t where t.id = :id ")
    Long getLikes(@Param("id") Long id);

    @Modifying
    @Query("update Tweet t set t.likes= :like where t.id = :id ")
    void addToLikes(@Param("id") Long id, @Param("like") Long like);

    boolean tweetExistById(Long id);


}
