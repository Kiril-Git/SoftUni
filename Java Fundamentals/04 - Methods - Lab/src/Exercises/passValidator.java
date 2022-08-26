package Exercises;

import java.util.Scanner;

public class passValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String passValidator = passValidator(input);

        if (passValidator.equals("valid")) {
            System.out.println("Password is valid");
        }
    }

    private static String passValidator(String input) {

        int counter1 = 0;
        int counter2 = 0;
        int counter3 = 0;

        int length = 0;
        int digits = 0;

        int not = 0;

        for (int i = 0; i < input.length(); i++) {

            char temp = input.charAt(i);
            length++;

            if (!Character.isLetterOrDigit(temp) & counter1 == 0){
                System.out.println("Password must consist only of letters and digits");
                counter1++;
                not++;
            }
             if (Character.isDigit(temp)){
                digits++;
            }
        }
        if (length < 6 || length > 10 & counter2 == 0){
            System.out.println("Password must be between 6 and 10 characters");
            counter2++;
            not++;
        }
         if (digits < 2 & counter3 == 0){
            System.out.println("Password must have at least 2 digits");
            counter3++;
            not++;
        }

        if (not > 0){
            return "invalid";
        }
        else {
            return "valid";
        }
    }
}
