package com.example.twitterapp.repository;

import com.example.twitterapp.entity.Tweet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;



public interface TweetRepository extends JpaRepository<Tweet, Long> {

    // TODO: 6/28/2024  this run time interpretation
    // handled with alias assignment to entity
    // t.likes FROM Tweet t

    @Modifying
    @Query("SELECT t.likes FROM Tweet t where t.id = :id ")
    Long getLikes(@Param("id") Long id);

    @Modifying
    @Query("UPDATE Tweet t set t.likes= :like where t.id = :id ")
    void addToLikes(@Param("id") Long id, @Param("like") Long like);

    boolean existsById(Long id);

}
