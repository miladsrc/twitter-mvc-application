package com.example.twitterapp.repository;

import com.example.twitterapp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.Optional;



public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findUserByUsername (String username);

    @Query("UPDATE User u SET u.password= :newPassword WHERE u.username= :username AND u.password= :oldPassword")
    @Modifying
    @ExceptionHandler
    void updatePasswordByUsername (@Param("username") String username,
                                   @Param("oldPassword") String oldPassword,
                                   @Param("newPassword") String newPassword);

    Optional<User> findUserByUsernameAndPassword(String username, String password);
}
