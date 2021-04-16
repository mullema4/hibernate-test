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
    select post0_.id as id1_0_
    from post post0_

    Hibernate:
    select postdetail0_.post_id as post_id1_1_0_
    from post_details postdetail0_
    where postdetail0_.post_id=?
    */
}