package testPerson;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Person person = new Person();
        Goat goat = new Goat();
        Doggie doggie = new Doggie();

        makeItSpeak(person);
        makeItSpeak(goat);
        makeItSpeak(doggie);

//        Полиморфизмът е възможността на една инстанция да придобива различни форми:

        Object something = new String();
        something = new Person();
        something = new Goat();


        Mammal mammal = new Person();

//        instanceof is a boolean operator

        if (mammal instanceof Person){
            double salary = ((Person) mammal).getSalary();
            System.out.println(salary);
        }
        else {
            System.out.println("Mammal is not a person!");
        }

        System.out.println(person.getSalary());
    }
    public static void makeItSpeak(Mammal mammal){
        mammal.speak();
    }

}
