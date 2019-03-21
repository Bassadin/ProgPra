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
        int[] sortArray = array;
        Arrays.sort(sortArray);
        System.out.println("Minimum: " + sortArray[0] + ". Maximum: " + sortArray[sortArray.length - 1] + ".");
    }
}