package Praktikum_2019_03_21;

public class Zweierpotenzen {

    public static void main(String[] args) {

        int base = 9;

        for (int i = 0; i < 10; i++) {
            System.out.println(base + " hoch "+ i + " : " + Math.round(Math.pow(base, i)));
        }

    }

}