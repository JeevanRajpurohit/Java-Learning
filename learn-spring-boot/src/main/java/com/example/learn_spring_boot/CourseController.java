package com.example.learn_spring_boot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    @RequestMapping("/Course")
    public List<Course> reteriveAllCourse(){
        return Arrays.asList(new Course("Jeevan",1,"Rakesh"), new Course("Bhavesh", 2,"Ramesh"),new Course("Raju",3,"Rahul"),new Course("Rajesh",4,"Mohit"),new Course("Raju",3,"Rahul"),new Course("Raju",3,"Rahul"),new Course("Raju",3,"Rahul"),new Course("Raju",3,"Rahul"));

    }
}
