package main.java.com.erenkov.aleksandr.se2.utils;

import main.java.com.erenkov.aleksandr.se2.model.entity.*;

import java.util.EnumSet;
import java.util.HashSet;

public class Generator {

    public static HashSet<User> generateUsers() {

        HashSet<User> users = new HashSet<>();

        users.add(new User(     // create user0, ADMIN
                0L,
                "000",
                "user0@mail.ru",
                "000",
                "user0First",
                "user0Last",
                EnumSet.of(Role.ADMIN)));

        users.add(new User(     //  create user1, STUDENT
                1L,
                "111",
                "user1@mail.ru",
                "111",
                "user1First",
                "user1Last",
                EnumSet.of(Role.STUDENT)));

        users.add(new User(     //  create user2, TEACHER
                2L,
                "222",
                "user2@mail.ru",
                "222",
                "user2First",
                "user2Last",
                EnumSet.of(Role.TEACHER)));

        users.add(new User(     //  create user3, ADMIN, TEACHER
                3L,
                "333",
                "user3@mail.ru",
                "333",
                "user3First",
                "user3Last",
                EnumSet.of(Role.TEACHER, Role.ADMIN)));

        return users;

    }

    public static Test generateTest() {
        //todo userGenerator
        return new Test();
    }

    public static HashSet<Answer> generateAnswers() {

        HashSet<Answer> answers = new HashSet<>();

        answers.add(new Answer(0L, 0L, "Answer_1 (question_0)"));
        answers.add(new Answer(1L, 0L, "Answer_2 (question_0)"));
        answers.add(new Answer(2L, 1L, "Answer_1 (question_1)"));
        answers.add(new Answer(3L, 1L, "Answer_2 (question_1)"));
        answers.add(new Answer(4L, 2L, "Answer_1 (question_2)"));
        answers.add(new Answer(5L, 2L, "Answer_2 (question_2)"));
        answers.add(new Answer(6L, 3L, "Answer_1 (question_3)"));
        answers.add(new Answer(7L, 3L, "Answer_2 (question_3)"));
        answers.add(new Answer(8L, 4L, "Answer_1 (question_4)"));
        answers.add(new Answer(9L, 4L, "Answer_2 (question_4)"));
        answers.add(new Answer(10L, 5L, "Answer_1 (question_5)"));
        answers.add(new Answer(11L, 5L, "Answer_2 (question_5)"));

        return answers;
    }

    public static HashSet<Question> generateQuestions() {

        HashSet<Question> questions = new HashSet<>();

        questions.add(new Question(0L, "Question_0:", new HashSet<Long>(), 0L, "section_1", 5.0F));
        questions.add(new Question(1L, "Question_1:", new HashSet<Long>(), 2L, "section_1", 5.0F));
        questions.add(new Question(2L, "Question_2:", new HashSet<Long>(), 4L, "section_1", 5.0F));
        questions.add(new Question(3L, "Question_3:", new HashSet<Long>(), 7L, "section_1", 5.0F));
        questions.add(new Question(4L, "Question_4:", new HashSet<Long>(), 9L, "section_1", 5.0F));
        questions.add(new Question(5L, "Question_5:", new HashSet<Long>(), 11L, "section_1", 5.0F));

        return questions;
    }

    public static HashSet<Test> generateTests() {

        HashSet<Test> tests = new HashSet<>();

        tests.add(new Test(0L,"Test_0", new HashSet<Question>()));
        tests.add(new Test(1L,"Test_1", new HashSet<Question>()));

        return tests;
    }

}
