package com.example.hibernatetest;

import javax.persistence.*;

@Entity
public class PostDetails {
    @Id
    private Long id;

    @OneToOne(mappedBy = "details", cascade = CascadeType.ALL)
    private Post post;
}