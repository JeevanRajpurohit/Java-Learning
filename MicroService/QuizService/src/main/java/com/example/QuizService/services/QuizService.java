package com.example.QuizService.services;

import com.example.QuizService.entity.Quiz;

import java.util.List;

public interface QuizService {

    Quiz add(Quiz quiz);

    List<Quiz> get();

    Quiz get(Long id);
}
