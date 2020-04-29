package main.java.com.erenkov.aleksandr.se2.model.repository;

import main.java.com.erenkov.aleksandr.se2.model.entity.Answer;

public interface AnswerRepository {

    Answer findAnswerById(Long id);

    boolean saveAndFlushAnswer(Answer answer);

    boolean deleteAnswer(Answer answer);
}
