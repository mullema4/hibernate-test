package com.example.hibernatetest

import javax.persistence.Entity
import javax.persistence.FetchType.LAZY
import javax.persistence.Id
import javax.persistence.OneToOne

@Entity
class Post(
    @Id
    val id: Long? = null,
    @OneToOne(fetch = LAZY)
    val details: PostDetails? = null
)