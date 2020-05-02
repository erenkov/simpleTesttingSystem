package main.java.com.erenkov.aleksandr.se2.model.repository;

import main.java.com.erenkov.aleksandr.se2.model.entity.TestResult;

import java.util.Set;

public interface TestResultRepository {

    TestResult findTestResultById(Long id);

    boolean saveAndFlushTestResult(TestResult testResult);

    boolean deleteTestResult(TestResult testResult);

    Set<TestResult> findTestResultsByTestId(long id);

}
