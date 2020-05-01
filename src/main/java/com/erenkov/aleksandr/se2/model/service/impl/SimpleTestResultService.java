package main.java.com.erenkov.aleksandr.se2.model.service.impl;

import main.java.com.erenkov.aleksandr.se2.model.entity.TestResult;
import main.java.com.erenkov.aleksandr.se2.model.repository.TestResultRepository;
import main.java.com.erenkov.aleksandr.se2.model.repository.impl.SimpleTestResultRepository;
import main.java.com.erenkov.aleksandr.se2.model.service.TestResultService;

public class SimpleTestResultService implements TestResultService {

    private final TestResultRepository testRepo = new SimpleTestResultRepository();


    @Override
    public TestResult findTestResultById(Long id) {
        return testRepo.findTestResultById(id);
    }

    @Override
    public boolean saveAndFlushTestResult(TestResult testResult) {
        return false;
    }

    @Override
    public boolean deleteTestResult(TestResult testResult) {
        return false;
    }
}
