package com.example.hibernatetest;

import javax.persistence.*;

@Entity
public class PostDetails {
    @Id
    private Long id;

    @OneToOne(fetch = FetchType.LAZY)
    @MapsId
    private Post post;
}