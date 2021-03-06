package main.java.com.erenkov.aleksandr.se2.model.entity;


import java.util.Objects;
import java.util.Set;

public class Test {

    //    @id
    private Long id;

    private String name;

    private String author;

    private Set<Question> questions;


    public Test() {
    }

    public Test(Long id, String name, String author, Set<Question> questions) {
        this.id = id;
        this.name = name;
        this.author = author;
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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Set<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(Set<Question> questions) {
        this.questions = questions;
    }

    @Override
    public String toString() {
        return "Test{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", number of questions=" + questions.size() +
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

