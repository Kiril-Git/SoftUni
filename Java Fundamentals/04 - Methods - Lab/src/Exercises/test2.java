package Exercises;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        System.out.println("↓ ↓ ↓");
        System.out.println("Please enter your name and age on the following two lines bellow ↓");

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());

        String s = parsePersonsData(name, age);

        System.out.println(s);


    }

    private static String parsePersonsData(String name, int age) {

        String result = "";
        result = String.format("%s is %d years old.\n", name, age);
        return result;
    }
}
