package main.java.com.erenkov.aleksandr.se2.model.entity;

import java.util.Map;
import java.util.Objects;
import java.util.Set;

//@Entity
public class Question {

//    @id
    private Long id;

//    @Column
    private String body;

//    @Column //OneToMany answer.id
    private Set<Answer> answers;

//    @Column // Может быть использовано для распределения вопросов по темам в будущем
    private String section;

//    @Column // Коэфициент за сложность вопроса в будущем
//    @Min(1)
//    @Max(10)
    private double factor;


    public Question() {
    }

    public Question(Long id, String body, Set<Answer> answers, String section, double factor) {
        this.id = id;
        this.body = body;
        this.answers = answers;
        this.section = section;
        this.factor = factor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Set<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(Set<Answer> answers) {
        this.answers = answers;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public double getFactor() {
        return factor;
    }

    public void setFactor(double factor) {
        this.factor = factor;
    }

    @Override
    public String toString() {
        return "Question{" +
                "id=" + id +
                ", body='" + body + '\'' +
                ", answers=" + answers +
                ", section='" + section + '\'' +
                ", factor=" + factor +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Question question = (Question) o;
        return factor == question.factor &&
                id.equals(question.id) &&
                body.equals(question.body) &&
                answers.equals(question.answers) &&
                section.equals(question.section);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, body, answers, section, factor);
    }
}
