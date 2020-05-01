package main.java.com.erenkov.aleksandr.se2.model.service.impl;

import main.java.com.erenkov.aleksandr.se2.model.entity.Test;
import main.java.com.erenkov.aleksandr.se2.model.repository.TestRepository;
import main.java.com.erenkov.aleksandr.se2.model.repository.impl.SimpleTestRepository;
import main.java.com.erenkov.aleksandr.se2.model.service.TestService;

import java.util.Set;

public class SimpleTestService implements TestService {

    private final TestRepository testRepo = new SimpleTestRepository();


    @Override
    public Test findTestById(Long id) {
        return testRepo.findTestById(id);
    }

    @Override
    public Test findTestByName(String name) {
        return testRepo.findTestByName(name);
    }

    @Override
    public boolean saveAndFlushTest(Test test) {
        return testRepo.saveAndFlushTest(test);
    }

    @Override
    public boolean deleteTest(Test test) {
        return testRepo.deleteTest(test);
    }

    @Override
    public Set<Test> getAllTests() {
        return testRepo.getAllTests();
    }

    @Override
    public Set<Test> findTestsByAuthor(String author) {
        return testRepo.findTestsByAuthor(author);
    }
}
