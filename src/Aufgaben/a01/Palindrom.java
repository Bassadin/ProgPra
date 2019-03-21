package Aufgaben.a01;

import static prog.ConsoleReader.*;

public class Palindrom {

    public static void main(String[] args) {

        String wort = readString();
        palindromTest(wort);
    }

    public static void palindromTest(String wort ) {
        if(isPalindrom(wort)) {

            System.out.println("Der String " + wort + " ist ein Palindrom");
        }
        else {

            System.out.println("Der String " + wort + " ist ein Palindrom");
        }
    }

    public static boolean isPalindrom(String wort) {

        boolean isPalindrom = false;
        // Ihr Code
        return isPalindrom;
    }
}
A