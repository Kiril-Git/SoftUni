package Exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class palindromeInts2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("END")) {

            int num = Integer.parseInt(input);

            String revN = "";

            for (int i = input.length()-1; i >= 0; i--) {

                char temp = input.charAt(i);
                revN += temp;
            }

            int revNum = Integer.parseInt(revN);

            if (revNum == num) {
                System.out.println("true");
            }
            else System.out.println("false");

            input = scanner.nextLine();
        }

    }
}
