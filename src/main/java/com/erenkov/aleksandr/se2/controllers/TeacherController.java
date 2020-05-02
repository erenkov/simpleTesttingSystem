package main.java.com.erenkov.aleksandr.se2.controllers;

import main.java.com.erenkov.aleksandr.se2.model.entity.Test;
import main.java.com.erenkov.aleksandr.se2.model.entity.User;
import main.java.com.erenkov.aleksandr.se2.model.service.TestResultService;
import main.java.com.erenkov.aleksandr.se2.model.service.TestService;
import main.java.com.erenkov.aleksandr.se2.model.service.impl.SimpleTestResultService;
import main.java.com.erenkov.aleksandr.se2.model.service.impl.SimpleTestService;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Map;
import java.util.stream.Collectors;

import static main.java.com.erenkov.aleksandr.se2.view.SimpleConsolePrinter.*;
import static main.java.com.erenkov.aleksandr.se2.view.SimpleConsolePrinter.print;

public class TeacherController {

    static TestService testService = new SimpleTestService();
    static TestResultService testResultServiceService = new SimpleTestResultService();


    public static void toControl(User user, BufferedReader bufferedReader) throws IOException {

        StringBuilder buffer;

        for (; ; ) { //FOREVER
            ln2();
            print("     Teacher panel");
            ln1();

            buffer = read("enter \"0\" to view Your Tests or \"back\" to back to main menu:", bufferedReader);

            switch (buffer.toString()) {
                case "0":
                    Map<String, Test> tests = testService
                            .findTestsByAuthor(user.getFirstName())
                            .stream()
                            .collect(Collectors.toMap(t -> t.getId().toString(), t -> t));

                    tests.forEach((k, t) -> print(t.toString()));

                    ln1();
                    buffer = read("Enter Test id to view results:", bufferedReader);
                    ln1();

                    if ((buffer.toString().matches("[0-9]*")) && (tests.get(buffer.toString()) != null)) {
                        print("Test id = " + buffer.toString() + ". Results:");
                        print(testResultServiceService.findTestResultsByTestId(Long.parseLong(buffer.toString()))
                                .stream().map(tR -> tR.toString() + "\n").collect(Collectors.joining()));
                    } else {
                        print("Error!!! It's not digit, or this test is not available!");
                    }
                    continue;
                case "back":
                    break;
                default:
                    print("Error! Sorry, try again");
                    continue;
            }
            break;
        }
    }
}
