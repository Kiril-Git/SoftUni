package lab;
//      Methods help to split large programs into smaller bits
//      improves code understanding
//      avoiding code-repetitions
//      void methods do not return any value

import java.util.Scanner;

public class testStudentData {

    public static void main(String[] args) {

        System.out.println("Please enter your name, age and grade on the following three lines below: ⬇️");

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        double grade = Double.parseDouble(scanner.nextLine());

        studentData(name, age, grade);
    }
    private static void studentData(String name, int age, double grade) {

        System.out.printf("Student: %s, age: %d, grade: %.2f\n", name, age, grade);
    }
}



