package main.java.com.erenkov.aleksandr.se2.model.entity;


import java.util.Map;
import java.util.Objects;

public class Test {

    //    @id
    private Long id;

    private String name;

    private Map<Long,Question> questions;


    public Test() {
    }

    public Test(Long id, String name, Map<Long, Question> questions) {
        this.id = id;
        this.name = name;
        this.questions = questions;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<Long, Question> getQuestions() {
        return questions;
    }

    public void setQuestions(Map<Long, Question> questions) {
        this.questions = questions;
    }

    @Override
    public String toString() {
        return "Test{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", questions=" + questions +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Test test = (Test) o;
        return id.equals(test.id) &&
                name.equals(test.name) &&
                questions.equals(test.questions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, questions);
    }
}

