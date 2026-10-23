package chapter2;

import java.util.Scanner;

public class Exercise02_13 {
    public static void main(String[] args) {

        System.out.println("Enter the monthly saving amount: ");
        Scanner sc = new Scanner(System.in);
        double eachMonthSaving = sc.nextDouble();
        double montlyInterestRate = 0.00417;

        double firstMonth = eachMonthSaving * (1+ montlyInterestRate);
        double secondMonth = (eachMonthSaving + firstMonth) * (1+ montlyInterestRate);
        double thirdMonth = (eachMonthSaving +secondMonth) * (1+ montlyInterestRate);
        double fourthMonth = (eachMonthSaving +thirdMonth) * (1+ montlyInterestRate);
        double fifthMonth = (eachMonthSaving +fourthMonth )* (1+ montlyInterestRate);
        double sixthMonth = (eachMonthSaving +fifthMonth) * (1+ montlyInterestRate);

        System.out.println("After the sixth month, the account value is $" + sixthMonth);

    }
}
