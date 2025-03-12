package com.example.QuestionService.repositories;

import com.example.QuestionService.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuestionRepository extends JpaRepository<Question,Long> {
  List<Question> findByQuizId(Long quizId);
}
