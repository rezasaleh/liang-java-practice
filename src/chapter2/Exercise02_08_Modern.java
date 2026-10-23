package chapter2;

import java.time.OffsetTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Exercise02_08_Modern {
    private static final DateTimeFormatter TIME_FORMATTER =
            DateTimeFormatter.ofPattern("HH:mm:ss");

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {

            System.out.print("Enter the time zone offset to GMT: ");
            int offsetHours = in.nextInt();

            if (offsetHours < -18 || offsetHours > 18) {
                System.out.println("Invalid time zone offset");
                return;
            }

            ZoneOffset offset = ZoneOffset.ofHours(offsetHours);
            OffsetTime currentTime = OffsetTime.now(offset);
            System.out.println("Current time at GMT "
                    + formatOffset(offsetHours)
                    + " is "
                    + currentTime.format(TIME_FORMATTER));
        }
    }
    private static String formatOffset(int offsetHours) {
        return offsetHours >= 0 ? "+" + offsetHours : String.valueOf(offsetHours);
    }
}
