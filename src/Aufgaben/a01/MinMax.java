package Aufgaben.a01;

import static prog.ConsoleReader.readInt;
import static prog.ConsoleReader.readIntArray;
public class MinMax {

    public static void main(String[] args) {

        int a = readInt("a");
        int b = readInt("b");
        int c = readInt("c");
        int[] array = readIntArray("array");

        printMinMaxArray(minMax(a,b,c));
        printMinMaxArray(minMax(array));
    }

    public static void printMinMaxArray(int[] minxMaxArray) {
        System.out.println("Minimum: " + minxMaxArray[0] + ". Maximum: " + minxMaxArray[1] + ".");
    }

    public static int[] minMax(int a, int b, int c) {
        return minMax(new int[]{a, b, c});
    }
    public static int[] minMax(int[] array) {
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
        return new int[]{min, max};
    }
}