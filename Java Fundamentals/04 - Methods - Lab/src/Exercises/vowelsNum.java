package Exercises;

import java.util.Locale;
import java.util.Scanner;

public class vowelsNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

//        int sm = smallestNum(num1, num2, num3);

        String getVowels = getVowels(input).toLowerCase();

        System.out.println(getVowels.length());

    }

    private static String getVowels(String input) {

        String getVowels = "";

        for (int i = 0; i < input.length(); i++) {

            char temp = input.toLowerCase().charAt(i);

            if (temp == 'a' || temp == 'o' || temp == 'e' || temp == 'i' || temp == 'u' || temp == 'y'){
                getVowels += temp;
            }
        }

        return getVowels;
    }
}
