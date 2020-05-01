package main.java.com.erenkov.aleksandr.se2.model.repository;

import main.java.com.erenkov.aleksandr.se2.model.entity.Test;

import java.util.Set;

public interface TestRepository {

    Test findTestById(Long id);

    Test findTestByName(String name);

    boolean saveAndFlushTest(Test test);

    boolean deleteTest(Test test);

    Set<Test> getAllTests();

    Set<Test> findTestsByAuthor(String author);

}
