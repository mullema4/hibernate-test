package com.example.hibernatetest

import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.stereotype.Service
import javax.transaction.Transactional

@Service
class HibernateTestService(val repository: PostRepository) : ApplicationRunner {

    @Transactional
    override fun run(args: ApplicationArguments) {
        repository.findAll()
    }

    /*
    Hibernate:
    select post0_.id as id1_0_, post0_.post as post2_0_
    from post post0_

    Hibernate:
    select postdetail0_.id as id1_1_0_, post1_.id as id1_0_1_, post1_.post as post2_0_1_
    from post_details postdetail0_
    left outer join post post1_ on postdetail0_.id=post1_.post
    where postdetail0_.id=?

    Hibernate:
    select post0_.id as id1_0_0_, post0_.post as post2_0_0_
    from post post0_
    where post0_.post=?
     */
}