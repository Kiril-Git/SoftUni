package ageNameSorting;

public class Person {

    private String firstName;
    private String lastName;
    private int age;

    public Person( String forename, String surname, int age) {
        this.age = age;
        this.firstName = forename;
        this.lastName = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString(){
        return String.format("%s %s is %d years old.", firstName, lastName, age);
    }
}
