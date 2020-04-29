package main.java.com.erenkov.aleksandr.se2.model.service;

import main.java.com.erenkov.aleksandr.se2.model.entity.TestResult;

public interface TestResultService {

    TestResult findTestResultById(Long id);

    boolean saveAndFlushTestResult(TestResult testResult);

    boolean deleteTestResult(TestResult testResult);
}
