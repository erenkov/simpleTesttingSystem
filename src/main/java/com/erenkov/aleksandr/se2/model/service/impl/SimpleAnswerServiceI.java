package main.java.com.erenkov.aleksandr.se2.model.service.impl;

import main.java.com.erenkov.aleksandr.se2.model.entity.Answer;
import main.java.com.erenkov.aleksandr.se2.model.repository.AnswerRepository;
import main.java.com.erenkov.aleksandr.se2.model.repository.impl.SimpleAnswerRepository;
import main.java.com.erenkov.aleksandr.se2.model.service.AnswerService;

public class SimpleAnswerServiceI implements AnswerService {

    private AnswerRepository answerRepo = new SimpleAnswerRepository();


    @Override
    public Answer findAnswerById(Long id) {
        return answerRepo.findAnswerById(id);
    }

    @Override
    public boolean saveAndFlushAnswer(Answer answer) {
        return answerRepo.saveAndFlushAnswer(answer);
    }

    @Override
    public boolean deleteAnswer(Answer answer) {
        return answerRepo.deleteAnswer(answer);
    }
}
