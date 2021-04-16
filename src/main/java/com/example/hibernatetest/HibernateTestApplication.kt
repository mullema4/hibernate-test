package com.example.hibernatetest

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class HibernateTestApplication {
}

fun main(args: Array<String>) {
    runApplication<HibernateTestApplication>(*args)
}