package main.java.com.erenkov.aleksandr.se2.model.entity;

import java.util.Objects;

public class TestResult {
//todo проверить - не 3я форма
    //    @id
    private Long id;

    private Long testId;

    private double difficultyFactor;

    private long numberOfQuestions;

    private long numberOfCorrectAnswers;

    private double points;

    private String result;


    public TestResult() {
    }

    public TestResult(Long id, Long testId, String testName, float difficultyFactor, long numberOfQuestions,
                      long numberOfCorrectAnswers, double points, String result) {
        this.id = id;
        this.testId = testId;
        this.difficultyFactor = difficultyFactor;
        this.numberOfQuestions = numberOfQuestions;
        this.numberOfCorrectAnswers = numberOfCorrectAnswers;
        this.points = points;
        this.result = result;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTestId() {
        return testId;
    }

    public void setTestId(Long testId) {
        this.testId = testId;
    }

    public double getDifficultyFactor() {
        return difficultyFactor;
    }

    public void setDifficultyFactor(double difficultyFactor) {
        this.difficultyFactor = difficultyFactor;
    }

    public long getNumberOfQuestions() {
        return numberOfQuestions;
    }

    public void setNumberOfQuestions(long numberOfQuestions) {
        this.numberOfQuestions = numberOfQuestions;
    }

    public long getNumberOfCorrectAnswers() {
        return numberOfCorrectAnswers;
    }

    public void setNumberOfCorrectAnswers(long numberOfCorrectAnswers) {
        this.numberOfCorrectAnswers = numberOfCorrectAnswers;
    }

    public double getPoints() {
        return points;
    }

    public void setPoints(double points) {
        this.points = points;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "TestResult{" +
                "id=" + id +
                ", testId=" + testId +
                ", difficultyFactor=" + difficultyFactor +
                ", numberOfQuestions=" + numberOfQuestions +
                ", numberOfCorrectAnswers=" + numberOfCorrectAnswers +
                ", points=" + points +
                ", result=" + result +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TestResult that = (TestResult) o;
        return Double.compare(that.difficultyFactor, difficultyFactor) == 0 &&
                numberOfQuestions == that.numberOfQuestions &&
                numberOfCorrectAnswers == that.numberOfCorrectAnswers &&
                Double.compare(that.points, points) == 0 &&
                id.equals(that.id) &&
                testId.equals(that.testId) &&
                result.equals(that.result);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, testId, difficultyFactor, numberOfQuestions, numberOfCorrectAnswers, points, result);
    }
}
