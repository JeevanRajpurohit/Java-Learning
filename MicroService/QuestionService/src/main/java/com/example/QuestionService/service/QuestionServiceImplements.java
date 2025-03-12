package com.example.QuestionService.service;

import com.example.QuestionService.entity.Question;
import com.example.QuestionService.repositories.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
@Service
public class QuestionServiceImplements implements QuestionService {


    private QuestionRepository questionRepository;

    public QuestionServiceImplements(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    @Override
    public Question add(Question question) {
        System.out.println("Before Saving: " + question);
        Question savedQuestion = questionRepository.save(question);
        System.out.println("After Saving: " + savedQuestion);
        return savedQuestion;
    }

    @Override
    public List<Question> get() {
        return questionRepository.findAll();
    }

    @Override
    public Question getOne( Long id) {
        return questionRepository.findById(id).orElseThrow(()-> new RuntimeException("Question Id not exisit"));
    }

    @Override
    public List<Question> getQuestionsOfQuiz(Long quizId) {
        return questionRepository.findByQuizId(quizId);
    }
}
