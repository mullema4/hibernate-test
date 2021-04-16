package com.example.hibernatetest

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.OneToOne

@Entity
class PostDetails(
    @Id
    private val id: Long? = null,
    @OneToOne(mappedBy = "details")
    private val post: Post? = null
)