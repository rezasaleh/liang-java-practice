package chapter1;

public class Exercise01_08 {
    double radius = 5.5;
    double area;
    double perimeter;

    double perimeter() {
        perimeter = 2 * Math.PI * radius;
        return perimeter;
    }

    double area() {
        area = Math.PI * radius * radius;
        ;
        return area;
    }

    public static void main(String[] args) {
        Exercise01_08 obj = new Exercise01_08();
        System.out.println("Area and Primeter of Circle:");
        System.out.println("Area of radius 5.5 = " + obj.area());
        System.out.println("Perimeter of radius 5.5 = " + obj.perimeter());
        System.out.println();
    }
}
