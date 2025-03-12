package com.example.QuizService.services;

import com.example.QuizService.entity.Question;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;


//@FeignClient(url = "http://localhost:8082",name = "Question-Client")
@FeignClient(name = "QUESTION-SERVICE")
public interface QuestionClient {


    @GetMapping("/question/quiz/{quizId}")
    List<Question> getQuestionsOfQuiz(@PathVariable Long quizId);
}