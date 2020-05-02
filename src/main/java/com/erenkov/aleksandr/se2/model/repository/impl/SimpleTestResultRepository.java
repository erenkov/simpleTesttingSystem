package main.java.com.erenkov.aleksandr.se2.model.repository.impl;

import main.java.com.erenkov.aleksandr.se2.model.entity.TestResult;
import main.java.com.erenkov.aleksandr.se2.model.repository.TestResultRepository;
import main.java.com.erenkov.aleksandr.se2.utils.Generator;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class SimpleTestResultRepository implements TestResultRepository {

    private final HashSet<TestResult> testResults = Generator.generateTestResults();

    @Override
    public TestResult findTestResultById(Long id) {
        return testResults.stream()
                .filter(t -> t.getId().equals(id))
                .findFirst()
                .orElse(new TestResult());
    }

    @Override
    public boolean saveAndFlushTestResult(TestResult testResult) {
        return testResults.add(testResult);
    }

    @Override
    public boolean deleteTestResult(TestResult testResult) {
        return testResults.remove(testResult);
    }

    @Override
    public Set<TestResult> findTestResultsByTestId(long id) {
        return testResults.stream()
                .filter(t -> t.getTestId().equals(id))
                .collect(Collectors.toSet());
    }
}
