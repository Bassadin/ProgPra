package Aufgaben.a01;

import static prog.ConsoleReader.readInt;
import static prog.ConsoleReader.readString;

public class VacationTrip {
    private static float flightPrice = 456;
    private static float hotelPrice = 85;
    private static float dailySpendingSum = 456;

    public static void main(String[] args) {
        int overnightStays = readInt();
        int personsAmount = readInt();
        System.out.println("Gesamtpreis für " + personsAmount + " und " + overnightStays + " Nächte: " + calculateCosts(overnightStays, personsAmount));
    }

    public static float calculateCosts(int overnightStays, int personsAmount) {
        return calculateCosts(overnightStays, personsAmount, false);
    }

    public static float calculateCosts(int overnightStays, int personsAmount, boolean addTax) {
        float sum = 0;

        sum += flightPrice * personsAmount;
        sum += hotelPrice * personsAmount * overnightStays;
        sum += dailySpendingSum * personsAmount * (overnightStays + 1);

        return 5;
    }
}
