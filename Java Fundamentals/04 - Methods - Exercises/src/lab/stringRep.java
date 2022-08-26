package lab;

import java.util.Scanner;

public class stringRep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the text and repsNum on the following two lines below: ⬇️");

        String text = scanner.nextLine();
        int reps = Integer.parseInt(scanner.nextLine());

        String line = concatenateStr(text, reps);

        System.out.println(line);

    }

    private static String concatenateStr(String text, int reps) {

        String line = "";
        for (int i = 0; i < reps; i++) {

             line += text;
        }
        return line;
    }
}
