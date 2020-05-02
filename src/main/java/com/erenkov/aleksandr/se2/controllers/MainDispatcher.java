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

            ln2();                          //Приветсвенное сообщение и горизонтальная линия
            writeGreeting();
            ln2();

            for (; ; ) { // FOREVER - чтение информации от пользователя. Выход "exit" => break

                buffer = read("Please enter a phone number or \"exit\":", bufferedReader);
                if (buffer.toString().equals("exit")) {
                    print("Goodbye!");
                    break;
                }

                User user = userService.findUserByTelephoneNumber(buffer.toString());
                if (user.getId() == null) {
                    print("User not found! Try again");
                    continue;
                }

                //todo если работать в cmd а не в IDE использовать System.console().readPassword();
                //                                              ,чтобы не выводить пароль на печать
                buffer = read("Please enter a password:", bufferedReader);

                if (!user.getEncryptedPassword().equals(CryptoUnit.encrypt(buffer.toString()))) {
                    print("Failed password! Try again");
                    continue;
                }

                ln1();
                print("Hello Mr. " + user.getFirstName() + " " + user.getLastName());
                print("You have roles : " + user.getRoles().toString());

                buffer = read("what role to use? " + userService.getStringRoles(user), bufferedReader);

                switch (buffer.toString()) {
                    case "0":
                        if (secure(user, Role.ADMIN)) {
                            AdminController.toControl(user, bufferedReader);
                        } else {
                            print("Sorry, you have not permit !!!");
                        }
                        break;
                    case "1":
                        if (secure(user, Role.STUDENT)) {
                            StudentController.toControl(user, bufferedReader);
                        } else {
                            print("Sorry, you have not permit !!!");
                        }
                        break;
                    case "2":
                        if (secure(user, Role.TEACHER)) {
                            TeacherController.toControl(user, bufferedReader);
                        } else {
                            print("Sorry, you have not permit !!!");
                        }
                        break;
                    default:
                        print("Sorry, role not found");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
