package chapter1;

public class Exercise01_12 {
    public static void main(String[] args) {
        double timeInHours;
        double km = 24 * 1.6;
        double averageSpeed;

        timeInHours = (3600 + 2400 + 35) / 3600.0;
        averageSpeed = km / timeInHours;
        System.out.printf("%.2f", averageSpeed);

    }
}
