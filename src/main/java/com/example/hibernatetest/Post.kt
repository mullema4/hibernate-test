package com.example.hibernatetest

import javax.persistence.*

@Entity
class Post {
    @Id
    @GeneratedValue
    private val id: Long? = null

    @OneToOne(cascade = [CascadeType.ALL], fetch = FetchType.LAZY)
    @JoinColumn(name = "post")
    private val details: PostDetails? = null
}