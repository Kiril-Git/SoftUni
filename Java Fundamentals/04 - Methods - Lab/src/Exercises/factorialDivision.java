package Exercises;

import java.util.Scanner;

public class factorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());

        printFactorialDivision(first, second);

    }

    private static void printFactorialDivision(int first, int second) {

        int sum1 = 1;

        if (first == 0){
            sum1 = 1;
        }
        for (int i = 1; i <= first; i++) {

            sum1 *= i;
        }
        int sum2 = 1;
        if (second == 0){
            sum2 = 1;
        }
        for (int i = 1; i <= second; i++) {

            sum2 *= i;
        }
        System.out.printf("%.2f", 1.0 * sum1 / sum2);
    }
}
