package lab;

import java.util.Scanner;

public class calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter an operation, " +
                "the first and second number on the following three lines below: ⬇️");

        String operations = scanner.nextLine();

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());

        switch (operations){

            case "add":
                adding(num1, num2);
                break;

            case "multiply":
                multiplying(num1, num2);
                break;

            case "subtract":
                subtracting(num1, num2);
                break;

            case "divide":
                dividing(num1, num2);
                break;
        }
    }

    private static void subtracting(int num1, int num2) {
        System.out.println(num1 - num2);

    }

    private static void multiplying(int num1, int num2) {
        System.out.println(num1 * num2);

    }

    private static void dividing(int num1, int num2) {
        System.out.println(num1 / num2);

    }

    private static void adding(int num1, int num2) {
        System.out.println(num1 + num2);
    }
}
