package orderByAge;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<Person> list = new ArrayList<>();

        while (!input.equals("End")){

            String[] inputLn = input.split(" ");

            String name = inputLn[0];
            String id = inputLn[1];
            int age = Integer.parseInt(inputLn[2]);

            Person person = new Person(name, id, age);

            list.add(person);

            list.sort(Comparator.comparingInt(Person::getAge));

            input = scanner.nextLine();
        }
        for (Person el : list){
            System.out.println(el.toString());
        }
    }
}
