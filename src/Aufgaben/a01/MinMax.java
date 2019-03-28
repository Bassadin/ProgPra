package Aufgaben.a01;

import java.util.Arrays;

import static prog.ConsoleReader.*;
public class MinMax {

    public static void main(String[] args) {

        int a = readInt("a");
        int b = readInt("b");
        int c = readInt("c");
        int[] array = readIntArray("array");

        minMax(a,b,c);
        minMax(array);
    }
    public static void minMax(int a, int b, int c) {
        minMax(new int[]{a, b, c});
    }
    public static void minMax(int[] array) {
        int max = array[0];
        int min = array[0];

        for (int eachNumber:array) {
            if (eachNumber < min) {
                min = eachNumber;
            }
            if (eachNumber > max) {
                max = eachNumber;
            }
        }

        System.out.println("Minimum: " + min + ". Maximum: " + max + ".");
    }
}