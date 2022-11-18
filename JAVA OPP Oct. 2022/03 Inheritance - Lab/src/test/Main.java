package test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Student student = new Student("Ivan", 12, "Ivan Vazov");

        System.out.println(student.getName());
        System.out.println(student.getAge() + " years old");


        Employee employee = new Employee("Stephan", 38, "Btx");

        System.out.println(employee.toString());
    }
}
