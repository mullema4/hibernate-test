package com.example.hibernatetest

import org.springframework.data.jpa.repository.JpaRepository

interface PostDetailsRepository : JpaRepository<PostDetails?, Long?>