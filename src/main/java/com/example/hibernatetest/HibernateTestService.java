package com.example.hibernatetest;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class HibernateTestService implements ApplicationRunner {

    private final PostRepository repository;

    @Override
    public void run(ApplicationArguments args) {
        repository.findAll();
    }

    /*
    Hibernate:
    select
        post0_.id as id1_0_,
        post0_.post as post2_0_
    from
        post post0_
    */
}