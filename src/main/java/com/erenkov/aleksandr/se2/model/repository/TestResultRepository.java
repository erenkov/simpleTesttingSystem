package main.java.com.erenkov.aleksandr.se2.model.repository;

import main.java.com.erenkov.aleksandr.se2.model.entity.TestResult;

public interface TestResultRepository {

    TestResult findTestResultById(Long id);

    boolean saveAndFlushTestResult(TestResult testResult);

    boolean deleteTestResult(TestResult testResult);
}
