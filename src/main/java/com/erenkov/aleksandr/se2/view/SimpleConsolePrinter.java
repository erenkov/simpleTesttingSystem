package main.java.com.erenkov.aleksandr.se2.view;

import java.io.BufferedReader;
import java.io.IOException;

public class SimpleConsolePrinter {

    public static final String vers = "0.1_2020-05-02";

    public static void print(String s) {
        System.out.println(s);
    }

    public static StringBuilder read(String outString, BufferedReader bufferedReader) throws IOException {
        print(outString);
        return new StringBuilder(bufferedReader.readLine());
    }

    public static void writeGreeting() {
        print("   Hello! This is \"SimpleTesterUtils\" by Erenkov Aleksandr, vers " + vers + ". Let`s go!");
    }

    public static void ln1() {
        print("--------------------------------------------------------------------------------------------");
    }

    public static void ln2() {
        print("============================================================================================");
    }

}
