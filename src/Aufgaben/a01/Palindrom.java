package Aufgaben.a01;

import static prog.ConsoleReader.*;

public class Palindrom {

    public static void main(String[] args) throws Exception {
        String wort = readString();
        if(isPalindrom(wort)) {
            System.out.println("Der String " + wort + " ist ein Palindrom");
        }
        else {
            System.out.println("Der String " + wort + " ist kein Palindrom");
        }
    }

    public static boolean isPalindrom(String word) throws Exception {
        int wordLength = word.length();
        if (wordLength == 0) {
            throw new Exception("Word length cannot be 0");
        }
        String wordAsLowercase = word.toLowerCase();

        //Check if word length is odd
        int secondSubstringStartIndex = (wordLength / 2) + ((wordLength & 1) == 0 ? 0 : 1);

        String wordFirstHalf = wordAsLowercase.substring(0, (wordLength / 2));
        String wordSecondHalf = wordAsLowercase.substring(secondSubstringStartIndex, wordLength);

        return wordFirstHalf.equals(new StringBuilder(wordSecondHalf).reverse().toString());
    }
}