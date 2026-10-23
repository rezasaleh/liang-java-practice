package chapter2;

import java.util.Scanner;

public class Exercise02_01 {
    public static void main(String[] args) {
        System.out.println("Enter a degree in Celsius: ");
        Scanner input = new Scanner(System.in);
        double celsius = input.nextDouble();
        double fahrenheit = celsius * 1.8 + 32;

        System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit");
    }
}
