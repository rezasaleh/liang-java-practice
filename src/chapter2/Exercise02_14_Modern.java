package chapter2;

import java.util.Scanner;

public class Exercise02_14_Modern {
    private static final double KILOGRAMS_PER_POUND = 0.45359237;
    private static final double METERS_PER_INCH = 0.0254;

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Enter weight in pounds: ");
            double weightInPounds = sc.nextDouble();

            System.out.println("Enter height in inches: ");
            double heightInInches = sc.nextDouble();

            if (weightInPounds <= 0 || heightInInches <= 0) {
                System.out.println("Weight and height must be positive.");
            }

            double weightInkilograms = poundsToKilograms(weightInPounds);
            double heightInMeter = inchesToMeters(heightInInches);

            double bmi = calculateBmi(weightInkilograms, heightInMeter);
            System.out.printf("BMI is %.4f%n", bmi);
        }
    }

    private static double calculateBmi(double weightInkilograms, double heightInMeter) {
        return weightInkilograms / (heightInMeter * heightInMeter);
    }

    private static double poundsToKilograms(double pounds) {
        return pounds * KILOGRAMS_PER_POUND;
    }

    private static double inchesToMeters(double inches) {
        return inches * METERS_PER_INCH;
    }
}
