package phoneBook;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> phoneBook = new TreeMap<>();

        String name = scanner.nextLine();
        String number = scanner.nextLine();

        phoneBook.put(name, number);

        User user = new User(name, number);

//        phoneBook.forEach((k, v) -> System.out.printf("%s - %s", k, v));

        System.out.println(user);

    }
}
