package main.java.com.erenkov.aleksandr.se2.model.service.impl;

import main.java.com.erenkov.aleksandr.se2.model.entity.Question;
import main.java.com.erenkov.aleksandr.se2.model.repository.QuestionRepository;
import main.java.com.erenkov.aleksandr.se2.model.repository.impl.SimpleQuestionRepository;
import main.java.com.erenkov.aleksandr.se2.model.service.QuestionService;

public class SimpleQuestionService implements QuestionService {

    private final QuestionRepository questionRepo = new SimpleQuestionRepository();


    @Override
    public Question findQuestionById(Long id) {
        return questionRepo.findQuestionById(id);
    }

    @Override
    public Question findQuestionByFactor(float factor) {
        return questionRepo.findQuestionByFactor(factor);
    }

    @Override
    public boolean saveAndFlushQuestion(Question question) {
        return questionRepo.saveAndFlushQuestion(question);
    }

    @Override
    public boolean deleteQuestion(Question question) {
        return questionRepo.deleteQuestion(question);
    }
}
