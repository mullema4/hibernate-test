package com.example.hibernatetest;

import javax.persistence.*;

@Entity
public class Post {
    @Id
    @GeneratedValue
    private Long id;

    @OneToOne(fetch = FetchType.LAZY)
    private PostDetails details;
}