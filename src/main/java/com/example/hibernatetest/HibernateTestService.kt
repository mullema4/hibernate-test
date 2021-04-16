package com.example.hibernatetest

import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.stereotype.Service
import javax.transaction.Transactional

@Service
class HibernateTestService(val repository: PostRepository) : ApplicationRunner {

    @Transactional
    override fun run(args: ApplicationArguments) {
        repository!!.findAll()
    }
}