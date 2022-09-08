//  list.stream().sorted((p1, p2) -> Integer.compare(p1.getAge(), p2.getAge()))
//        .forEach(el -> System.out.println(el.toString()));

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class orderByAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<Person> list = new ArrayList<>();

        while (!input.equals("End")){

            String[] line = input.split(" ");

            String name = line[0];
            String iD = line[1];
            int age = Integer.parseInt(line[2]);

            Person person = new Person(name, iD, age);

            list.add(person);

            input = scanner.nextLine();
        }
        list.stream().sorted((p1, p2) -> Integer.compare(p1.getAge(), p2.getAge()))
                .forEach(el -> System.out.println(el.toString()));
    }

    static class Person {

        String name;
        String iD;
        int age;

        public Person(String name, String iD, int age) {
            this.name = name;
            this.iD = iD;
            this.age = age;
        }

        public int getAge() {
            return age;
        }
        @Override
        public String toString(){

            return String.format("%s with ID: %s is %d years old.", this.name, this.iD, this.age);
        }
    }
}
