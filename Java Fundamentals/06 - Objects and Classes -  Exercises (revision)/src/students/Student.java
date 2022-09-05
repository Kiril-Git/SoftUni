package students;

import java.util.Objects;

public class Student {

    String fName;
    String surName;
    double grade;


    public Student(String fName, String surName, double grade) {
        this.fName = fName;
        this.surName = surName;
        this.grade = grade;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public String toString(){

        return String.format("%s %s: %.2f", this.fName, this.surName, this.grade);
    }
}
