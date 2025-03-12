package com.example.learn_jpaAndHibernatewithSpringBoot;

import com.example.learn_jpaAndHibernatewithSpringBoot.entityMapping.StudentDAO;
import com.example.learn_jpaAndHibernatewithSpringBoot.entityMapping.StudentFromDAIICT;
import com.jpa.test.dao.UserRepository;
import com.jpa.test.entities.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LearnJpaAndHibernatewithSpringBootApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(LearnJpaAndHibernatewithSpringBootApplication.class, args);
		UserRepository userRepository= context.getBean(UserRepository.class);

		User user1= new User();
		user1.setName("Jeevan Rajpurohit");
		user1.setCity("Surat");
		user1.setStatus("I am a java + React Developer");

		User user2= userRepository.save(user1);

		System.out.println(user2);
	}

//	@Bean
//	public CommandLineRunner commandLineRunnerer(String[] args){
//		return runner -> {
//			System.out.println("Hello world");
//		};
//	}
//@Bean
//public CommandLineRunner commandLineRunnerer(StudentDAO studentDAO){
//	return runner -> {
//		createStudent(studentDAO);
//	};
//}

//	private void createStudent(StudentDAO studentDAO) {
//		System.out.println("Creating new student object..");
//		StudentFromDAIICT studentFromDAIICT= new StudentFromDAIICT("Jeevan","Rajpurohit","jeevan123@gmail.com");
//
//		System.out.println("Saving the student");
//		studentDAO.save(studentFromDAIICT);
//
//		System.out.println("Student saved have a Id as " + studentFromDAIICT.getId());
//	}

}
