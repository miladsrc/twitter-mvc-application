package com.example.twitterapp.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.SoftDelete;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SoftDelete
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "likes")
public class Like {

    @Id
    private Long id;


    @ManyToOne
    @JoinColumn(name = "tweet_id")
    Tweet tweet;


    @ManyToMany
    List<User> users = new ArrayList<>();
}
