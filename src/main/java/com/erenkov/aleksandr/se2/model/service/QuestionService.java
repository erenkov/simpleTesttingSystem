package main.java.com.erenkov.aleksandr.se2.model.service;

import main.java.com.erenkov.aleksandr.se2.model.entity.Question;

public interface QuestionService {

    Question findQuestionById(Long id);

    Question findQuestionByFactor(float factor);

    boolean saveAndFlushQuestion(Question question);

    boolean deleteQuestion(Question question);
}
