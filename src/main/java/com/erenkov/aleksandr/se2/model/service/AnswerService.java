package main.java.com.erenkov.aleksandr.se2.model.service;

import main.java.com.erenkov.aleksandr.se2.model.entity.Answer;

import java.util.Set;

public interface AnswerService {

    Answer findAnswerById(Long id);

    boolean saveAndFlushAnswer(Answer answer);

    boolean deleteAnswer(Answer answer);

    Set<Answer> findAnswersByQuestionId(long id);
}
