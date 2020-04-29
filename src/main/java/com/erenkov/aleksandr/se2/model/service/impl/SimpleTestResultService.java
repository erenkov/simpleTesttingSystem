package main.java.com.erenkov.aleksandr.se2.model.service.impl;

import main.java.com.erenkov.aleksandr.se2.model.entity.TestResult;
import main.java.com.erenkov.aleksandr.se2.model.repository.TestRepository;
import main.java.com.erenkov.aleksandr.se2.model.repository.impl.SimpleTestRepository;
import main.java.com.erenkov.aleksandr.se2.model.service.TestResultService;

public class SimpleTestResultService implements TestResultService {

    private TestRepository testRepo = new SimpleTestRepository();


    @Override
    public TestResult findTestResultById(Long id) {
        return null;
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
