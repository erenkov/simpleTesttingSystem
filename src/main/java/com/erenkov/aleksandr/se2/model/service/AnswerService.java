package main.java.com.erenkov.aleksandr.se2.model.service;

import main.java.com.erenkov.aleksandr.se2.model.entity.Answer;

public interface AnswerService {

    Answer findAnswerById(Long id);

    boolean saveAndFlushAnswer(Answer answer);

    boolean deleteAnswer(Answer answer);
}
