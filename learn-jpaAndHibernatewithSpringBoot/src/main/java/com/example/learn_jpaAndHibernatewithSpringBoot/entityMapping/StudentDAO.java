package com.example.learn_jpaAndHibernatewithSpringBoot.entityMapping;

import org.springframework.stereotype.Repository;

@Repository
public interface StudentDAO {

     void save(StudentFromDAIICT student1);
}
