import java.util.Scanner;

public class StringRepetition2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        int reps = Integer.parseInt(scanner.nextLine());

        getOutput (text, reps);                           // num - Arguments

        String output = (getOutput(text, reps));
        System.out.println( output);
    }

    private static String getOutput(String text, int reps) {

        String result = "";

        for (int i = 0; i < reps; i++) {

            result += text;
        }
        return result;
    }}
// return - с return  се прекратява изпълнението на метода, дори това да е main method-a.

// DRY  -  Do not repeat yourself!!!
// WET  -  We enjoy typing!!!

// Всеки код е като книга, където:
// Методите са глаголите,
// а променливите - съществителните.


