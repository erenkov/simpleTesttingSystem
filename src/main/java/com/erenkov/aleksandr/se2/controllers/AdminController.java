package main.java.com.erenkov.aleksandr.se2.controllers;

import main.java.com.erenkov.aleksandr.se2.model.entity.User;
import main.java.com.erenkov.aleksandr.se2.model.service.UserService;
import main.java.com.erenkov.aleksandr.se2.model.service.impl.SimpleUserService;

import java.io.BufferedReader;
import java.io.IOException;

import static main.java.com.erenkov.aleksandr.se2.view.SimpleConsolePrinter.*;

public class AdminController {

    static UserService userService = new SimpleUserService();

    public static void toControl(User user, BufferedReader bufferedReader) throws IOException {

        StringBuilder buffer;

        for (; ; ) { // FOREVER
            ln2();
            print("     Admin panel");
            ln1();

            buffer = read("enter \"0\" to view users or \"back\" to back to main menu:", bufferedReader);

            switch (buffer.toString()) {
                case "0":
                    userService
                            .getAllUsers()
                            .forEach(u -> print(u.toString()));
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
