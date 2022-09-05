package students;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Student> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            String[] input = scanner.nextLine().split(" ");

            String fName = input[0];
            String surName = input[1];
            double grade = Double.parseDouble(input[2]);

            Student student = new Student(fName, surName, grade);

            list.add(student);
        }
        list.stream().sorted((s1, s2) -> Double.compare(s2.getGrade(), s1.getGrade()))
                .forEach(student -> System.out.println(student.toString()));
    }
}
