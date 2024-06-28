package com.example.twitterapp.entity;


import jakarta.persistence.*;
import jakarta.persistence.Table;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SoftDelete
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(name = "username", unique = true)
    String username;

    @Column(name = "password")
    String password;
}
