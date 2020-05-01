package main.java.com.erenkov.aleksandr.se2.view;

public class SimpleConsolePrinter {

    public static final String vers = "0.1_2020-05-01";

    public static void print(String s){
        System.out.println(s);
    }

    public static void writeGreeting(){
        print("   Hello! This is \"SimpleTester\" utils by Erenkov Aleksandr, vers " + vers + ". Let`s go");
    }

    public static void ln1(){
        print("--------------------------------------------------------------------------------------------");
    }

    public static void ln2(){
        print("============================================================================================");
    }


}
