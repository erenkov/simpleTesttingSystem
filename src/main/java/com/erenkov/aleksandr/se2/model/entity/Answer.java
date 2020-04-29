package main.java.com.erenkov.aleksandr.se2.model.entity;

import java.util.Objects;

public class Answer {

//    @id
    private Long id;

    //ManyToOne question.answers
    private Long questionId;

    private String body;


    public Answer() {
    }

    public Answer(Long id, Long questionId, String body) {
        this.id = id;
        this.questionId = questionId;
        this.body = body;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Long questionId) {
        this.questionId = questionId;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "Answer{" +
                "id=" + id +
                ", questionId=" + questionId +
                ", body='" + body + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Answer answer = (Answer) o;
        return id.equals(answer.id) &&
                questionId.equals(answer.questionId) &&
                body.equals(answer.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, questionId, body);
    }
}
