package Exercises;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        System.out.println("Please enter your name and age on the following two lines bellow ↓");

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());

        int maxNum = Integer.MIN_VALUE;

//        print();
        studentDataPrinting(name, age);

    }

    private static void print() {

        System.out.println("Sunshine :-)");
    }

    private static void studentDataPrinting(String name, int age) {

        System.out.printf("%s is %d years old.\n", name, age);
    }
}
