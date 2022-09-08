package orderByAge;

public class Person {

    String name;
    String iD;
    int age;

    public Person(String name, String iD, int age) {
        this.name = name;
        this.iD = iD;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getiD() {
        return iD;
    }

    public int getAge() {
        return age;
    }
    @Override
    public String toString(){

        return String.format("%s with ID: %s is %d years old.", this.name, this.iD, this.age);
    }

}
