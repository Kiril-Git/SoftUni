package students;

public class Student {

    //    Характеристики -> полета      better set as private
    private String fName;
    private String surName;
    private double grade;

    //    Конструктор -> създаваме обекти - public
    public Student (String fName, String surName, double grade){

//        нов обект
        this.fName = fName ;
        this.surName = surName;
        this.grade = grade;
    }
//    Methods:

    public String getfName() {
        return this.fName;
    }
    public String getSurName(){
        return this.surName;
    }
    public double getGrade() {
        return this.grade;
    }
//                              "{first name} {second name}: {grade}"
    @Override
    public String toString() {
        return String.format("%s %s: %.2f", this.fName, this.surName, this.grade);
    }
}
