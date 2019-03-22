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
            System.out.println("Der String " + wort + " ist kein Palindrom");
        }
    }

    public static boolean isPalindrom(String word) {
        int wordLength = word.length();

        //Check if word length is odd
        if ((wordLength & 1) != 0) {
            return false;
        }

        String wordFirstHalf = word.toLowerCase().substring(0, (wordLength / 2));
        String wordSecondHalf = word.toLowerCase().substring((wordLength / 2), wordLength);

        return wordFirstHalf.equals(new StringBuilder(wordSecondHalf).reverse().toString());
    }
}