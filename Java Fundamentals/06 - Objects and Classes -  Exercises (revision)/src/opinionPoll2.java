
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class opinionPoll2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Person> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");

            String name = input[0];
            int age = Integer.parseInt(input[1]);

            Person person = new Person(name, age);

            list.add(person);
        }
        list.stream().sorted((p1, p2) -> p1.getName().compareTo(p2.getName()))
                .filter(person -> person.getAge() >= 30)
                .forEach(person -> System.out.println(person.toString()));
    }
    static class Person{
        String name;
        int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
        @Override
        public String toString(){

            return String.format("%s - %d",this.name, this.age);
        }
    }
}
