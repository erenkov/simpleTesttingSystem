package main.java.com.erenkov.aleksandr.se2.model.repository;

import main.java.com.erenkov.aleksandr.se2.model.entity.Question;

public interface QuestionRepository {

    Question findQuestionById(Long id);

    Question findQuestionByFactor(float Factor);

    boolean saveAndFlushQuestion(Question question);

    boolean deleteQuestion(Question question);


}
