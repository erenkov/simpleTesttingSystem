package main.java.com.erenkov.aleksandr.se2.controllers;

import main.java.com.erenkov.aleksandr.se2.model.entity.User;
import main.java.com.erenkov.aleksandr.se2.model.service.TestResultService;
import main.java.com.erenkov.aleksandr.se2.model.service.TestService;
import main.java.com.erenkov.aleksandr.se2.model.service.impl.SimpleTestResultService;
import main.java.com.erenkov.aleksandr.se2.model.service.impl.SimpleTestService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static main.java.com.erenkov.aleksandr.se2.view.SimpleConsolePrinter.*;
import static main.java.com.erenkov.aleksandr.se2.view.SimpleConsolePrinter.print;

public class TeacherController {

    static TestService testService = new SimpleTestService();
    static TestResultService testResultServiceService = new SimpleTestResultService();


    public static void toControl(User user) {

        StringBuilder buffer;

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {

            for (; ; ) { //FOREVER
                ln2();
                print("     Teacher panel");
                ln1();
                print("enter \"0\" to view Your Tests or \"exit\" to exit:");
                buffer = new StringBuilder(bufferedReader.readLine());
                switch (buffer.toString()) {
                    case "0":
                        int i = 0;
                        testService.findTestsByAuthor(user.getFirstName()).forEach(t-> print(t.toString()));
                        ln1();
                        print("Enter Test id to view results:");
                        buffer = new StringBuilder(bufferedReader.readLine());
                        ln1();

                        if(buffer.toString().matches("[0-9]*")) {
                            print("\n");
                            print("Test id = " + buffer.toString() + ". Results:");
                            print(testResultServiceService.findTestResultById(Long.valueOf(buffer.toString())).toString());
                        } else  {
                            print("Error!! Its not digit!!!");
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
        } catch (
                IOException e) {
            System.err.print(e.toString()); //todo что я тут делаю?
        }
    }
}
