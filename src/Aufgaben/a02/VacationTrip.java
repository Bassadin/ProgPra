package Aufgaben.a02;

import static prog.ConsoleReader.*;

public class VacationTrip {
    private static float flightPrice = 456;
    private static float hotelPrice = 85;
    private static float dailySpendingSum = 456;

    public static void main(String[] args) {
        flightPrice = readFloat("Flugpreis pro Person");
        hotelPrice = readFloat("Hotelpreis pro Person");
        dailySpendingSum = readFloat("Tägliche Ausgaben pro Person");
        int overnightStays = readInt("Anzahl Übernachtungen");
        String beginDateString = readString("Beginndatum im Format YYYYMMDD");
        String endDateString = readString("Enddatum im Format YYYYMMDD");



        int personsAmount = readInt("Anzahl Personen");
        System.out.println(
            "Gesamtpreis für "
                + personsAmount
                + " und "
                + overnightStays
                + " Nächte: Netto: "
                + calculateCosts(overnightStays, personsAmount)
                + "€; Brutto: "
                + calculateCosts(overnightStays, personsAmount, true));
    }

    private static double calculateCosts(int overnightStays, int personsAmount) {
        return calculateCosts(overnightStays, personsAmount, false);
    }

    private static double calculateCosts(int overnightStays, int personsAmount, boolean addTax) {
        float totalSum = 0;

        totalSum += (flightPrice * personsAmount) * (addTax ? 1.19 : 1); //Add Tax if addTax is true
        totalSum += (hotelPrice * personsAmount * overnightStays) * (addTax ? 1.07 : 1); //Add Tax if addTax is true
        totalSum += dailySpendingSum * personsAmount * (overnightStays + 1);

        return roundToTwoDecimals(totalSum);
    }

    private static double roundToTwoDecimals(float numberToRound) {
        return Math.round(numberToRound * 100.0) / 100.0;
    }
}
