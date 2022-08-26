package Exercises;

import java.util.Scanner;

public class middChar {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        printMiddChar(input);

    }

    private static void printMiddChar(String input) {

        if (input.length() % 2 != 0) {

            int middChar = input.length() / 2;
            char temp = input.charAt(middChar);
            System.out.println(temp);
        }
        else {
            int middChar = input.length() / 2;
            char temp1 = input.charAt(middChar-1);
            char temp2 = input.charAt(middChar);

            System.out.printf("%c%c", temp1, temp2);
        }
    }
}
