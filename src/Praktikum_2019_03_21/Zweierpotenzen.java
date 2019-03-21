package Praktikum_2019_03_21;

public class Zweierpotenzen {

    public static void main(String[] args) {

        int x = 1;
        int i = 0;

        while(  x <= 10 ) {

            System.out.println("2 hoch "+ i + " : " + x);
            x = x * 2;
            i = i + 1;
        }

    }

}