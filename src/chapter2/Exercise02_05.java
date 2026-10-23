package chapter2;

import java.util.Scanner;

public class Exercise02_05 {
    public static void main(String[] args) {
        System.out.println("Enter the subtotal and a gratuity rate: ");
        Scanner input = new Scanner(System.in);
        double subtotal = input.nextDouble();
        double gratuityRate = input.nextDouble() / 100;
        double gratuity = subtotal * gratuityRate;
        double total = subtotal + gratuity;
        System.out.println("The gratuity is: " + "$" + gratuity + " and total is $" + total);
    }
}
