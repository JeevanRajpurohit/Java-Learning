package com.example.learn_jpaAndHibernatewithSpringBoot.entityMapping;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDAOImplements implements StudentDAO{

   private EntityManager entityManager;

   @Autowired
   public StudentDAOImplements(EntityManager entityManager) {
        this.entityManager = entityManager;
   }

   @Override
   @Transactional
   public void save(StudentFromDAIICT student1){
       entityManager.persist(student1);
   }


}
