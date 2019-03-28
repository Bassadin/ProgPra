package Praktikum_2019_03_21;

public class ConsoleTest {
    public static void main(String[] args) {
        System.out.print("Hi, ");
        for (String name :args) {
            System.out.print(name + " ");
        }

        System.out.println(". How are you?");
    }
}