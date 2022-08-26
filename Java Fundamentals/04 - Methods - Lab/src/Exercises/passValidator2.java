package Exercises;

import java.util.Scanner;

public class passValidator2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int cheer = 0;

        passlengthValidator(input);
        digitsNumValidator(input);
        charsValidator(input);
        
        if (!passlengthValidator(input)){
            cheer++;
            System.out.println("Password must be between 6 and 10 characters");
        }
        if (!charsValidator(input)){
            cheer++;
            System.out.println("Password must consist only of letters and digits");
        }
        if (!digitsNumValidator(input)){
            cheer++;
            System.out.println("Password must have at least 2 digits");
        }
        if (cheer == 0){
            System.out.println("Password is valid");
        }
    }

    private static boolean charsValidator(String input) {

        int not = 0;

        for (int i = 0; i < input.length(); i++) {

            char temp = input.charAt(i);

            if (!Character.isLetterOrDigit(temp)){
                not++;
            }
        }
        if (not != 0){
            return false;
        }
        else {
            return true;
        }
    }

    private static boolean digitsNumValidator(String input) {

        int digits = 0;

        for (int i = 0; i < input.length(); i++) {
            char temp = input.charAt(i);
            if (Character.isDigit(temp)){
                digits++;
            }
        }
        if (digits > 1){
            return true;
        }
        else {
            return false;
        }
    }

    private static boolean passlengthValidator(String input) {

        if (input.length() < 6 || input.length() > 10){
            return false;
        }
        else {
            return true;
        }
    }
}

//      youtu.be/bYh6efSWj7w