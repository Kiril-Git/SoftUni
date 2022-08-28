package students;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Student> studentList = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            String[] inputLn = scanner.nextLine().split(" ");

            String fName = inputLn[0];
            String surName = inputLn[1];
            double grade = Double.parseDouble(inputLn[2]);

            Student student = new Student(fName ,surName, grade);
            studentList.add(student);

            studentList.sort(Comparator.comparingDouble(Student::getGrade).reversed());
        }
        for (Student el : studentList)
        System.out.println(el.toString());
    }
}
