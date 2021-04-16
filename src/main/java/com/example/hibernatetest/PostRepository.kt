package com.example.hibernatetest

import org.springframework.data.jpa.repository.JpaRepository

interface PostRepository : JpaRepository<Post?, Long?>