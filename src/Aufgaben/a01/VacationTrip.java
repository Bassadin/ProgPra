package Aufgaben.a01;

import static prog.ConsoleReader.readInt;

public class VacationTrip {
    private static float flightPrice = 456;
    private static float hotelPrice = 85;
    private static float dailySpendingSum = 456;

    public static void main(String[] args) {
        int overnightStays = readInt("Anzahl Übernachtungen");
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
        return Math.round(numberToRound * 1000) / 1000;
        //TODO Mit Kommaverschiebung nochmal selbst implementieren
    }
}
