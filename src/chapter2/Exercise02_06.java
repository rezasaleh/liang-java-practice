package chapter2;

import java.util.Scanner;

public class Exercise02_06 {
    public static void main(String[] args) {
        System.out.println("Enter a number between 0 and 1000: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number >= 0 && number < 1000) {
           int leftDigit = number / 100;
           int twoRightDigit = number % 100;
           int middleDigit = twoRightDigit / 10;
           int lastDigit = twoRightDigit % 10;
           int sum = leftDigit + middleDigit + lastDigit;
            System.out.println("The sum of the digits is " + sum);
        }
    }
}
