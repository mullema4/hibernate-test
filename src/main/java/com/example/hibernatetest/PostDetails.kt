package com.example.hibernatetest

import javax.persistence.CascadeType
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.OneToOne

@Entity
class PostDetails {
    @Id
    private val id: Long? = null

    @OneToOne(mappedBy = "details", cascade = [CascadeType.ALL])
    private val post: Post? = null
}