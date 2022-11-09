package test;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("Petko", "Pelev", 36);

        System.out.println(person.getFullName());

        System.out.println("-");

        Dog dog = new Dog();
        dog.setAge(12);
        dog.setName("Tarzan");


        dog.setName("Spartak");
        System.out.println(dog);


        Person person1 = new Person("Dido", "Stankov", 51);
        Person person2 = new Person("Ivo", "Andonov", 51);
        Person person3 = new Person("Kozhata", "Muletarovski", 51);

        List<Person> personList = new ArrayList<>();

        personList.add(person1);
        personList.add(person2);
        personList.add(person3);

        Uni uni = new Uni("the life itself", personList);

//                                   Exception: Collections UnmodifiableList
        uni.getStudents().remove(2);
        System.out.println();


        // watch?v=pJzYP253_K4
    }
}
