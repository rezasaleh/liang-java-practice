package chapter2;

import java.util.Scanner;

public class Exercise02_14 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter weight in pounds: ");
        double weight = sc.nextDouble();
        System.out.println("Enter height in inches: ");
        double height = sc.nextDouble();
        double kilogram = weight * 0.45359237;
        double meter = height * 0.0254;

        double bmi = kilogram / (meter*meter);




        System.out.printf("BMI is %.4f%n", bmi);
    }
}
