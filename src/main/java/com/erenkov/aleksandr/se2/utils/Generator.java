package main.java.com.erenkov.aleksandr.se2.utils;

import main.java.com.erenkov.aleksandr.se2.model.entity.Role;
import main.java.com.erenkov.aleksandr.se2.model.entity.Test;
import main.java.com.erenkov.aleksandr.se2.model.entity.TestResult;
import main.java.com.erenkov.aleksandr.se2.model.entity.User;

import java.util.EnumSet;
import java.util.HashSet;

public class Generator {
    //todo generic<>

    public static HashSet<User> generateUser() {

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

    public static TestResult generateTestResult() {
        //todo testResultGenerator
        return new TestResult();
    }
}
