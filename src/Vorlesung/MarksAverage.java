package Vorlesung;

import java.text.DecimalFormat;
import java.util.stream.DoubleStream;

public class MarksAverage {
    public static void main (String[] args) {
        double[] marks = {2.3, 4.0, 1.7, 4.0, 5.0, 1.0, 1.2};
        DecimalFormat df = new DecimalFormat("#.##");

        System.out.println(df.format(averageOfArray(marks)));
        System.out.println(occurrencesOfMarkInArray(marks, 4.0));
    }

    public static double averageOfArray(double[] marksArray) {
        return DoubleStream.of(marksArray).sum() / marksArray.length;
    }

    public static int occurrencesOfMarkInArray(double[] marksArray, double markToSearch) {
        int counter = 0;
        for (double i: marksArray) {
            if (i == markToSearch) {
                counter++;
            }
        }
        return counter;
    }
}
