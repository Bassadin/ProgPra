package Aufgaben.a01;

import org.junit.Test;

import static org.junit.Assert.*;

public class MinMaxTest {

    @Test
    public void minMax1_3_5() {
        assertArrayEquals(MinMax.minMax(new int[]{1, 3, 5}), new int[]{1, 5});
    }

    @Test
    public void minMax60_32_222() {
        assertArrayEquals(MinMax.minMax(new int[]{60, 32, 222}), new int[]{32, 222});
    }

    @Test
    public void minMax9001() {
        assertArrayEquals(MinMax.minMax(new int[]{9001}), new int[]{9001, 9001});
    }
}