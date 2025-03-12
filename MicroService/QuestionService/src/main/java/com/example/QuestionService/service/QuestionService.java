package com.example.QuestionService.service;

import com.example.QuestionService.entity.Question;

import java.util.List;

public interface QuestionService {

     Question add(Question question);

     List<Question> get();

     Question getOne(Long id);

     List<Question> getQuestionsOfQuiz(Long quizId);
}
