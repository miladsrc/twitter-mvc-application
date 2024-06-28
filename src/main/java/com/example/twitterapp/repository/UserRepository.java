package com.example.twitterapp.repository;

import com.example.twitterapp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.Optional;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findUserByUsername (String username);

    @Query("UPDATE User u SET u.password= :newPssword WHERE u.username= :username AND u.password= :oldPassword")
    @Modifying
    void updatePasswordByUsername (@Param("username") String username,
                                   @Param("oldPassword") String oldPassword,
                                   @Param("newPassword") String newPassword);

    Optional<User> findUserByUsernameAndPassword(String username, String password);
}
