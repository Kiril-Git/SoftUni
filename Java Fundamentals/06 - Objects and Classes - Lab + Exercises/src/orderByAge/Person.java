package orderByAge;

public class Person {

    //    Характеристики -> полета      better set as private
    private String name;
    private String id;
    private int age;

    //    Конструктор -> създаваме обекти - public
    public Person (String name, String id, int age){

//        нов обект
        this.name = name ;
        this.id = id;
        this.age = age;
    }
//    Methods:

    public String getName() {
        return this.name;
    }
    public String getId(){
        return this.id;
    }
    public int getAge() {
        return this.age;
    }
    //                              "{first name} {second name}: {grade}"
    @Override
    public String toString() {
        return String.format("%s with ID: %s is %d years old.", this.name, this.id, this.age);
    }
}
