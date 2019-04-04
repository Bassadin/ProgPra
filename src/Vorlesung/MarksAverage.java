package Vorlesung;

import java.text.DecimalFormat;

public class MarksAverage {
    public static void main (String[] args) {
        double[] marks = {2.3, 4.0, 1.7, 4.0, 5.0, 1.0, 1.2};
        DecimalFormat df = new DecimalFormat("#.##");

        System.out.println(df.format(arrayAverage(marks)));

        System.out.println(numberOfSpecificMark(marks, 4.0));
    }

    public static double arrayAverage(double[] array) {
        double sum = 0.0;
        for (double i: array) {
            sum += i;
        }
        return sum / array.length;
    }

    public static int numberOfSpecificMark(double[] array, double markToSearch) {
        int counter = 0;
        for (double i: array) {
            if (i == markToSearch) {
                counter++;
            }
        }
        return counter;
    }
}
