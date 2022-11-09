package salaryIncrease;

import java.util.Scanner;

public class Person {

    private String forename;
    private String surname;
    private int age;
    private double salary;

    public Person(String forename, String surname, int age, double salary) {
        this.forename = forename;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
    }

    public String getForename() {
        return forename;
    }

    public void setForename(String forename) {
        this.forename = forename;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void increaseSalary(double bonus) {

        if (this.getAge() < 30)
            salary *= 1.1;
        else
            salary *= 1.2;
    }

    @Override
    public String toString(){
        return String.format("%s %s gets %.2f leva", forename, surname, salary);
    }
}

