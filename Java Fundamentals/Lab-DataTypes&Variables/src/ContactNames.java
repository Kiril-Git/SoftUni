import java.util.Scanner;

public class ContactNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String foreName = scanner.nextLine();
        String surName = scanner.nextLine();
        String delimiter = scanner.nextLine();

        String result = foreName + delimiter + surName;

        System.out.println(result);
    }
}
