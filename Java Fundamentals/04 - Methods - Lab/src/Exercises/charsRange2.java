package Exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class charsRange2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char first = scanner.nextLine().charAt(0);
        char last = scanner.nextLine().charAt(0);

        printChars(first, last);


    }

    private static void printChars(char first, char last) {

        if (first > last) {

            char temp = first;
            first = last;
            last = temp;

        }
        for (int i = first+1; i < last; i++) {

            System.out.printf("%c ", i);
        }

    }
}
