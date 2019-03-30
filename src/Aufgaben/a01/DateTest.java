package Aufgaben.a01;

import org.junit.Test;

import static org.junit.Assert.*;

public class DateTest {

    @Test
    public void printDateString1997() {
        assertEquals(new Date(1997, 12, 12).printAsYYYYMMDDString(), "19971212");
    }

    @Test
    public void printDateStringWithSingleCharacterMonthIndex() {
        assertEquals(new Date(1997, 1, 11).printAsYYYYMMDDString(), "19970111");
    }

    @Test
    public void printDateStringWithSingleCharacterMonthIndexAndDayIndex() {
        assertEquals(new Date(2019, 5, 5).printAsYYYYMMDDString(), "20190505");
    }

    @Test
    public void dateFromDateString20190505() throws Exception {
        assertTrue(Date.dateFromYYYYMMDDString("20190505").equals(new Date(2019, 5, 5)));
    }

    @Test
    public void dateFromDateString2019() throws Exception {
        assertTrue(Date.dateFromYYYYMMDDString("2019").equals(new Date(2019, 5, 5)));
    }
}