package Aufgaben.a01;

public class Date {
    private int dayIndex, monthIndex, year;

    //Getter
    public int getDayIndex() {
        return dayIndex;
    }
    public int getMonthIndex() {
        return monthIndex;
    }
    public int getYear() {
        return year;
    }

    //Constructor
    public Date(int year, int monthIndex, int dayIndex) {
        this.dayIndex = dayIndex;
        this.monthIndex = monthIndex;
        this.year = year;
    }

    //API
    public static Date dateFromYYYYMMDDString(String dateString) throws Exception {
        if (dateString.length() != 8) {
            throw new Exception("String is not 8 chars long");
        }
        return new Date(
            Integer.parseInt(dateString.substring(0, 4)),
            Integer.parseInt(dateString.substring(5, 6)),
            Integer.parseInt(dateString.substring(7, 8))
        );
    }

    public boolean equals(Date dateToCompare) {
        return dayIndex == dateToCompare.dayIndex && monthIndex == dateToCompare.monthIndex && year == dateToCompare.year;
    }

    public String printAsYYYYMMDDString() {
        return year + printNumberWithZeroPadding(monthIndex) + printNumberWithZeroPadding(dayIndex);
    }

    //Helper methods
    private String printNumberWithZeroPadding(int number) {
        if (number >= 10) {
            return Integer.toString(number);
        } else {
            return "0" + number; //Add a leading zero if the number is smaller than 10
        }
    }
}
