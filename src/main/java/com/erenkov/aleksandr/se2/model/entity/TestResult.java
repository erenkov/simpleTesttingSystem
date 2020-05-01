package main.java.com.erenkov.aleksandr.se2.model.entity;

import java.util.Objects;

public class TestResult {
//todo проверить - не 3я форма
    //    @id
    private Long id;

    private Long testId;

    private String studentName;

    private double testFactor;

    private long questionsNumber;

    private long correctAnswersNumber;

    private String result;


    public TestResult() {
    }

    public TestResult(Long id, Long testId, String studentName, double testFactor, long questionsNumber, long correctAnswersNumber, String result) {
        this.id = id;
        this.testId = testId;
        this.studentName = studentName;
        this.testFactor = testFactor;
        this.questionsNumber = questionsNumber;
        this.correctAnswersNumber = correctAnswersNumber;
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

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public double getTestFactor() {
        return testFactor;
    }

    public void setTestFactor(double testFactor) {
        this.testFactor = testFactor;
    }

    public long getQuestionsNumber() {
        return questionsNumber;
    }

    public void setQuestionsNumber(long questionsNumber) {
        this.questionsNumber = questionsNumber;
    }

    public long getCorrectAnswersNumber() {
        return correctAnswersNumber;
    }

    public void setCorrectAnswersNumber(long correctAnswersNumber) {
        this.correctAnswersNumber = correctAnswersNumber;
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
                ", studentName=" + studentName +
                ", testFactor=" + testFactor +
                ", questionsNumber=" + questionsNumber +
                ", correctAnswersNumber=" + correctAnswersNumber +
                ", result=\n" + result +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TestResult that = (TestResult) o;
        return Double.compare(that.testFactor, testFactor) == 0 &&
                questionsNumber == that.questionsNumber &&
                correctAnswersNumber == that.correctAnswersNumber &&
                id.equals(that.id) &&
                testId.equals(that.testId) &&
                studentName.equals(that.studentName) &&
                result.equals(that.result);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, testId, studentName, testFactor, questionsNumber, correctAnswersNumber, result);
    }
}
