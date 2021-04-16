package com.example.hibernatetest;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class PostDetails {
    @Id
    private Long id;

    @OneToOne(mappedBy = "details")
    private Post post;
}