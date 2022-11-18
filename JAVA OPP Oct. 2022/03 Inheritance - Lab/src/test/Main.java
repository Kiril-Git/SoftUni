package test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Student student = new Student("Ivan", 12, "Ivan Vazov");

        System.out.println(student.getName());
        System.out.println(student.getAge() + " years old");


        Employee employee = new Employee("Stephan", 38, "Btx");
        Person employee2 = new Employee("Todor", 46, "DBS");

        System.out.println(employee.toString());
        System.out.println(employee2.toString());
    }
}
