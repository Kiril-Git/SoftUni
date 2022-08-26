package lab;

import java.util.Scanner;

public class integerSign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your number on the line below: ⬇️");


        int n = Integer.parseInt(scanner.nextLine());

        printSign(n);
    }

    private static void printSign(int n) {

        if (n < 0){
            System.out.printf("The number %d is negative.", n);
        }
        else if (n > 0){
            System.out.printf("The number %d is positive.", n);
        }
        else {
            System.out.printf("The number %d is zero.", n);
        }
    }
}
