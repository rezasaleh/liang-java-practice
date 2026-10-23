package chapter2;

import java.util.Scanner;

public class Exercise02_07 {
    public static void main(String[] args) {
        System.out.println("Enter the number of minutes: ");
        Scanner input = new Scanner(System.in);
        int minutes = input.nextInt();
        int totalDays = minutes / (60 * 24);
        int year = totalDays / 365;
        int day = totalDays % 365;

        System.out.println(minutes + "minutes is approximately " + year + " and " + day + " days");


    }
}
