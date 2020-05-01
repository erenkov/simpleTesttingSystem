package main.java.com.erenkov.aleksandr.se2.model.repository.impl;

import main.java.com.erenkov.aleksandr.se2.model.entity.Answer;
import main.java.com.erenkov.aleksandr.se2.model.repository.AnswerRepository;
import main.java.com.erenkov.aleksandr.se2.utils.Generator;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class SimpleAnswerRepository implements AnswerRepository {

    private HashSet<Answer> answers= Generator.generateAnswers();


    @Override
    public Answer findAnswerById(Long id) {
        return answers.stream()
                .filter(a -> a.getId().equals(id))
                .findFirst()
                .orElse(new Answer());
    }

    @Override
    public boolean saveAndFlushAnswer(Answer answer) {
        return answers.add(answer);
    }

    @Override
    public boolean deleteAnswer(Answer answer) {
        return answers.remove(answer);
    }

    @Override
    public Set<Answer> findAnswersByQuestionId(long id) {
        return answers.stream()
                .filter(a -> a.getQuestionId().equals(id))
                .collect(Collectors.toSet());
    }
}
