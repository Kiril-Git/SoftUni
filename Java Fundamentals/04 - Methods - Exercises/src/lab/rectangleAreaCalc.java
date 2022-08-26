package lab;

import java.util.Scanner;

public class rectangleAreaCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the width and length on the following two lines below: ⬇️");

        double width = Double.parseDouble(scanner.nextLine());
        double length = Double.parseDouble(scanner.nextLine());

        double area = rectangleAreaCalculation(width, length);

        System.out.printf("%.0f", area);

    }

    private static double rectangleAreaCalculation(double width, double length) {

        return width * length;
    }
}
