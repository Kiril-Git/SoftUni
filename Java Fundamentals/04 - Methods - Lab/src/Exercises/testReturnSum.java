package Exercises;

import java.util.Scanner;

public class testReturnSum {
    public static void main(String[] args) {
        System.out.println("↓ ↓ ↓");
        System.out.println("Please enter two integers on the following two lines bellow to sum ↓");

        Scanner scanner = new Scanner(System.in);

//        String name = scanner.nextLine();
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());

        int sum = sumNums(num1, num2);

        System.out.println(sum);


    }

    private static int sumNums(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }

}
