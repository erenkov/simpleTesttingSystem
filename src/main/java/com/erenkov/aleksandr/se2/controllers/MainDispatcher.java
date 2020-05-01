package main.java.com.erenkov.aleksandr.se2.controllers;

import main.java.com.erenkov.aleksandr.se2.model.entity.Role;
import main.java.com.erenkov.aleksandr.se2.model.entity.User;
import main.java.com.erenkov.aleksandr.se2.model.service.UserService;
import main.java.com.erenkov.aleksandr.se2.model.service.impl.SimpleUserService;
import main.java.com.erenkov.aleksandr.se2.utils.CryptoUnit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static main.java.com.erenkov.aleksandr.se2.utils.SimpleAppSecurity.secure;

import static main.java.com.erenkov.aleksandr.se2.view.SimpleConsolePrinter.*;

public class MainDispatcher {


    public static void runApp() {

        UserService userService = new SimpleUserService();
        StringBuilder buffer;

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {

            ln2();
            writeGreeting();

            for (; ; ) { //FOREVER
                ln2();
                print("Please enter a phone number or \"exit\":");

                buffer = new StringBuilder(bufferedReader.readLine());
                if (buffer.toString().equals("exit")) {
                    break;
                }

                User user = userService.findUserByTelephoneNumber(buffer.toString());
                if (user.getId() == null) {
                    print("User not found! Try again");
                    continue;
                }

                print("Please enter a password:");

                //todo если работать в cmd а не в IDE использовать System.console().readPassword();
                //                                              ,чтобы не выводить пароль на печать
                buffer = new StringBuilder(bufferedReader.readLine());

                if (!user.getEncryptedPassword().equals(CryptoUnit.encrypt(buffer.toString()))) {
                    print("Failed password! Try again");
                    continue;
                }
                ln1();
                print("Hello Mr. " + user.getFirstName() + " " + user.getLastName());
                print("You has role : " + user.getRoles().toString());
                print("what role to use? 0 - ADMIN, 1 - STUDENT, 2 - TEACHER");

                buffer = new StringBuilder(bufferedReader.readLine());

                switch (buffer.toString()) {
                    case "0":
                        if (secure(user, Role.ADMIN)) {
                            AdminController.toControl(user);
                        } else {
                            print("Sorry, you have not permit !!!");
                        }
                        break;
                    case "1":
                        if (secure(user, Role.STUDENT)) {
                            StudentController.toControl(user);
                        } else {
                            print("Sorry, you have not permit !!!");
                        }
                        break;
                    case "2":
                        if (secure(user, Role.TEACHER)) {
                            TeacherController.toControl(user);
                        } else {
                            print("Sorry, you have not permit !!!");
                        }
                        break;
                    default:
                        print("Sorry, role not found");
                        continue;
                }
                print("Goodbye!!!");
                break;
            }
        } catch (IOException e) {
            System.err.print(e.toString()); //todo что я тут делаю?
        }
    }

}
