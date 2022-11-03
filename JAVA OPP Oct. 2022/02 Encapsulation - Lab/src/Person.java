import java.util.Scanner;

public class Person {

    private String forename;
    private String surname;
    private int age;

    public Person(String forename, String surname, int age) {
        this.forename = forename;
        this.surname = surname;
        this.age = age;
    }

    public String getForename() {
        return forename;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString(){
        return String.format("%s %s is %d years old.", forename, surname, age);
    }
}
