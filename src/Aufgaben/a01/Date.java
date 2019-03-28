package Aufgaben.a01;

public class Date {
    private int dayIndex, monthIndex, year;


    public Date(int year, int monthIndex, int dayIndex) {
        this.dayIndex = dayIndex;
        this.monthIndex = monthIndex;
        this.year = year;
    }

    public static Date dateFromYYYYMMDDString(String dateString) throws Exception {
        if (dateString.length() != 8) {
            throw new Exception("String is not 8 chars long");
        }

        return new Date(Integer.parseInt(dateString.substring(1, 4)), Integer.parseInt(dateString.substring(5, 6)), Integer.parseInt(dateString.substring(7, 8)));
    }

    public String printAsYYYYMMDDString() {
        return Integer.toString(year) + printNumberWithZeroPadding(monthIndex) + printNumberWithZeroPadding(dayIndex);
    }

    private String printNumberWithZeroPadding(int number) {
        if (number >= 10) {
            return Integer.toString(number);
        } else {
            return "0" + Integer.toString(number);
        }
    }
}
