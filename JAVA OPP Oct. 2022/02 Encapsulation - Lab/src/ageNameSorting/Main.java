package ageNameSorting;

import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        List<Person> people = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] input = sc.nextLine().split(" ");
            people.add(new Person(input[0], input[1], Integer.parseInt(input[2])));
        }

        Collections.sort(people, Comparator.comparing(Person::getFirstName).thenComparingInt(Person::getAge));

        for (Person el : people) {
            System.out.println(el.toString());
        }
    }
}
