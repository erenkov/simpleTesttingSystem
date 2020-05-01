package main.java.com.erenkov.aleksandr.se2.controllers;

import main.java.com.erenkov.aleksandr.se2.model.entity.User;
import main.java.com.erenkov.aleksandr.se2.model.service.TestService;
import main.java.com.erenkov.aleksandr.se2.model.service.impl.SimpleTestService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static main.java.com.erenkov.aleksandr.se2.view.SimpleConsolePrinter.*;

public class StudentController {

    static TestService testService = new SimpleTestService();

    public static void toControl(User user) {

        StringBuilder buffer;

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {

            for (; ; ) { //FOREVER
                ln2();
                print("     Student panel");
                ln1();
                print("enter \"0\" to view Tests or \"exit\" to exit:");
                buffer = new StringBuilder(bufferedReader.readLine());
                switch (buffer.toString()) {
                    case "0":
                        testService
                                .getAllTests()
                                .forEach(t -> print(t.toString()));
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
