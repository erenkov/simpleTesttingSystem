package main.java.com.erenkov.aleksandr.se2.utils;

import main.java.com.erenkov.aleksandr.se2.model.entity.*;
import main.java.com.erenkov.aleksandr.se2.model.service.AnswerService;
import main.java.com.erenkov.aleksandr.se2.model.service.QuestionService;
import main.java.com.erenkov.aleksandr.se2.model.service.TestService;
import main.java.com.erenkov.aleksandr.se2.model.service.impl.SimpleAnswerService;
import main.java.com.erenkov.aleksandr.se2.model.service.impl.SimpleQuestionService;
import main.java.com.erenkov.aleksandr.se2.model.service.impl.SimpleTestService;

import java.util.EnumSet;
import java.util.HashSet;
import java.util.stream.Collectors;

public class Generator {

    public static HashSet<User> generateUsers() {

        HashSet<User> users = new HashSet<>();

        users.add(new User(     // create user0, ADMIN
                0L,
                "000",
                "user0@mail.ru",
                CryptoUnit.encrypt("000"),
                "user0First",
                "user0Last",
                EnumSet.of(Role.ADMIN)));

        users.add(new User(     //  create user1, STUDENT
                1L,
                "111",
                "user1@mail.ru",
                CryptoUnit.encrypt("111"),
                "user1First",
                "user1Last",
                EnumSet.of(Role.STUDENT)));

        users.add(new User(     //  create user2, TEACHER
                2L,
                "222",
                "user2@mail.ru",
                CryptoUnit.encrypt("222"),
                "user2First",
                "user2Last",
                EnumSet.of(Role.TEACHER)));

        users.add(new User(     //  create user3, ADMIN, TEACHER
                3L,
                "333",
                "user3@mail.ru",
                CryptoUnit.encrypt("333"),
                "user3First",
                "user3Last",
                EnumSet.of(Role.TEACHER, Role.ADMIN)));

        users.add(new User(     // create user4, ADMIN
                4L,
                "444",
                "user4@mail.ru",
                CryptoUnit.encrypt("444"),
                "user4First",
                "user4Last",
                EnumSet.of(Role.ADMIN)));

        users.add(new User(     //  create user5, STUDENT
                5L,
                "555",
                "user5@mail.ru",
                CryptoUnit.encrypt("555"),
                "user5First",
                "user5Last",
                EnumSet.of(Role.STUDENT)));

        users.add(new User(     //  create user6, TEACHER
                6L,
                "666",
                "user6@mail.ru",
                CryptoUnit.encrypt("666"),
                "user6First",
                "user6Last",
                EnumSet.of(Role.TEACHER)));

        users.add(new User(     //  create user7, ADMIN, TEACHER
                7L,
                "777",
                "user7@mail.ru",
                CryptoUnit.encrypt("777"),
                "user7First",
                "user7Last",
                EnumSet.of(Role.TEACHER, Role.ADMIN)));


        return users;

    }

    public static HashSet<Answer> generateAnswers() {

        HashSet<Answer> answers = new HashSet<>();

        answers.add(new Answer(0L, 0L, "Answer_1_(question_0)", true));
        answers.add(new Answer(1L, 0L, "Answer_2_(question_0)", false));
        answers.add(new Answer(2L, 1L, "Answer_1_(question_1)", true));
        answers.add(new Answer(3L, 1L, "Answer_2_(question_1)", false));
        answers.add(new Answer(4L, 2L, "Answer_1_(question_2)", true));
        answers.add(new Answer(5L, 2L, "Answer_2_(question_2)", false));
        answers.add(new Answer(6L, 3L, "Answer_1_(question_3)", true));
        answers.add(new Answer(7L, 3L, "Answer_2_(question_3)", false));
        answers.add(new Answer(8L, 4L, "Answer_1_(question_4)", true));
        answers.add(new Answer(9L, 4L, "Answer_2_(question_4)", false));
        answers.add(new Answer(10L, 5L, "Answer_1_(question_5)", true));
        answers.add(new Answer(11L, 5L, "Answer_2_(question_5)", false));

        return answers;
    }

    public static HashSet<Question> generateQuestions() {

        HashSet<Question> questions = new HashSet<>();

        AnswerService answerService = new SimpleAnswerService();

        questions.add(new Question(0L, "Question_0:", answerService.findAnswersByQuestionId(0L), "section_1", 5.0F));
        questions.add(new Question(1L, "Question_1:", answerService.findAnswersByQuestionId(1L), "section_1", 5.0F));
        questions.add(new Question(2L, "Question_2:", answerService.findAnswersByQuestionId(2L), "section_1", 5.0F));
        questions.add(new Question(3L, "Question_3:", answerService.findAnswersByQuestionId(3L), "section_1", 5.0F));
        questions.add(new Question(4L, "Question_4:", answerService.findAnswersByQuestionId(4L), "section_1", 5.0F));
        questions.add(new Question(5L, "Question_5:", answerService.findAnswersByQuestionId(5L), "section_1", 5.0F));

        return questions;
    }

    public static HashSet<Test> generateTests() {

        HashSet<Test> tests = new HashSet<>();

        QuestionService questionService = new SimpleQuestionService();

        HashSet<Question> questionForTest0 = new HashSet<>();
        questionForTest0.add(questionService.findQuestionById(0L));
        questionForTest0.add(questionService.findQuestionById(2L));
        questionForTest0.add(questionService.findQuestionById(4L));
        tests.add(new Test(0L, "Test_0", "user2First", questionForTest0));

        HashSet<Question> questionForTest1 = new HashSet<>();
        questionForTest1.add(questionService.findQuestionById(1L));
        questionForTest1.add(questionService.findQuestionById(3L));
        questionForTest1.add(questionService.findQuestionById(5L));
        tests.add(new Test(1L, "Test_1", "user3First", questionForTest1));

        HashSet<Question> questionForTest2 = new HashSet<>();
        questionForTest2.add(questionService.findQuestionById(0L));
        questionForTest2.add(questionService.findQuestionById(2L));
        questionForTest2.add(questionService.findQuestionById(4L));
        tests.add(new Test(2L, "Test_2", "user3First", questionForTest2));

        HashSet<Question> questionForTest3 = new HashSet<>();
        questionForTest3.add(questionService.findQuestionById(1L));
        questionForTest3.add(questionService.findQuestionById(3L));
        questionForTest3.add(questionService.findQuestionById(5L));
        tests.add(new Test(3L, "Test_3", "user7First", questionForTest3));

        return tests;
    }

    public static HashSet<TestResult> generateTestResults() {

        HashSet<TestResult> testResults = new HashSet<>();
        TestService testService = new SimpleTestService();


        testResults.add(new TestResult(0L,
                0L,
                "user1First",
                testService.findTestById(0L)
                        .getQuestions()
                        .stream()
                        .mapToDouble(Question::getFactor)
                        .average()
                        .orElse(Double.NaN),
                testService.findTestById(0L).getQuestions().size(),
                3L,
                testService
                        .findTestById(0L)
                        .getQuestions()
                        .stream()
                        .map(q -> q.getBody() + " " + q
                                .getAnswers()
                                .stream()
                                .filter(Answer::isCorrect)
                                .map(Answer::getBody)
                                .collect(Collectors.joining())
                                + "\n")
                        .collect(Collectors.joining())
        ));


        testResults.add(new TestResult(1L,
                1L,
                "user1First",
                testService.findTestById(1L)
                        .getQuestions()
                        .stream()
                        .mapToDouble(Question::getFactor)
                        .average()
                        .orElse(Double.NaN),
                testService.findTestById(1L).getQuestions().size(),
                3L,
                testService
                        .findTestById(1L)
                        .getQuestions()
                        .stream()
                        .map(q -> q.getBody() + " " + q
                                .getAnswers()
                                .stream()
                                .filter(Answer::isCorrect)
                                .map(Answer::getBody)
                                .collect(Collectors.joining())
                                + "\n")
                        .collect(Collectors.joining())
        ));

        testResults.add(new TestResult(2L,
                0L,
                "user5First",
                testService.findTestById(0L)
                        .getQuestions()
                        .stream()
                        .mapToDouble(Question::getFactor)
                        .average()
                        .orElse(Double.NaN),
                testService.findTestById(0L).getQuestions().size(),
                3L,
                testService
                        .findTestById(0L)
                        .getQuestions()
                        .stream()
                        .map(q -> q.getBody() + " " + q
                                .getAnswers()
                                .stream()
                                .filter(Answer::isCorrect)
                                .map(Answer::getBody)
                                .collect(Collectors.joining())
                                + "\n")
                        .collect(Collectors.joining())
                        ));


        testResults.add(new TestResult(3L,
                3L,
                "user1First",
                testService.findTestById(3L)
                        .getQuestions()
                        .stream()
                        .mapToDouble(Question::getFactor)
                        .average()
                        .orElse(Double.NaN),
                testService.findTestById(3L).getQuestions().size(),
                3L,
                testService
                        .findTestById(3L)
                        .getQuestions()
                        .stream()
                        .map(q -> q.getBody() + " " + q
                                .getAnswers()
                                .stream()
                                .filter(Answer::isCorrect)
                                .map(Answer::getBody)
                                .collect(Collectors.joining())
                                + "\n")
                        .collect(Collectors.joining())
                        ));

        return testResults;
    }

}
