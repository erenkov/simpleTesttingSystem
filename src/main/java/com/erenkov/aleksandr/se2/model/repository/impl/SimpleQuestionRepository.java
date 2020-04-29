package main.java.com.erenkov.aleksandr.se2.model.repository.impl;

import main.java.com.erenkov.aleksandr.se2.model.entity.Question;
import main.java.com.erenkov.aleksandr.se2.model.repository.QuestionRepository;
import main.java.com.erenkov.aleksandr.se2.utils.Generator;

import java.util.HashSet;

public class SimpleQuestionRepository implements QuestionRepository {

    private HashSet<Question> questions = Generator.generateQuestions();


    @Override
    public Question findQuestionById(Long id) {
        return questions.stream()
                .filter(a -> a.getId().equals(id))
                .findFirst()
                .orElse(new Question());
    }

    @Override
    public Question findQuestionByFactor(float factor) {
        return questions.stream()
                .filter(a -> a.getFactor() == factor)
                .findFirst()
                .orElse(new Question());
    }

    @Override
    public boolean saveAndFlushQuestion(Question question) {
        return questions.add(question);
    }

    @Override
    public boolean deleteQuestion(Question question) {
        return questions.remove(question);
    }
}
