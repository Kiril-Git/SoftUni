package opinionPoll;

import java.lang.reflect.Method;

public class Person {

    //    Характеристики -> полета      better set as private
    private String name;
    private int years;

    //    Конструктор -> създаваме обекти - public
    public Person (String name, int years){

//        нов обект
        this.name = name ;
        this.years = years;
    }
//    Methods:

    public String getName() {
        return this.name;
    }

    public int getYears() {
        return this.years;
    }
}
