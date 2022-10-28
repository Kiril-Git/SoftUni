package student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentSystem studentSystem = new StudentSystem();

        String[] input = readLn(scanner);

        while (!input[0].equals("Exit")) {

            studentSystem.parseCommand(input);

            input = readLn(scanner);
        }
    }

    private static String[] readLn(Scanner scanner) {
        return scanner.nextLine().split(" ");
    }
}
