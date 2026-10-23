package chapter2;

import java.util.Scanner;

public class Exercise02_08 {
    public static void main(String[] args) {
        System.out.print("Enter the time zone time zone offset to GMT: ");
        Scanner input = new Scanner(System.in);
        int timeZoneOffset = input.nextInt();
        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds / 1000;
        long currentSecond = totalSeconds % 60;

        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;

        long totalHours = totalMinutes / 60;
        long currentHour = (totalHours % 24) + timeZoneOffset;

        if (currentHour < 0) {
            currentHour += 24;
        }

        if (currentHour >= 24) {
            currentHour -= 24;
        }
        System.out.printf("Current time is %02d:%02d:%02d%n",
                currentHour,
                currentMinute,
                currentSecond
        );
    }
}
