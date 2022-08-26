import java.util.Scanner;

public class StringRepetition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        int reps = Integer.parseInt(scanner.nextLine());

        getOutput (text, reps);                           // num - Arguments

        String output = (getOutput(text, reps));
        System.out.println( output);
    }

    private static String getOutput(String text, int reps) {

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < reps; i++) {

            result.append(text);
        }
        return result.toString();
    }
}
// return - с return  се прекратява изпълнението на метода, дори това да е main method-a.

// DRY  -  Do not repeat yourself!!!
// WET  -  We enjoy typing!!!

// Всеки код е като книга, където:
// Методите са глаголите,
// а променливите - съществителните.


