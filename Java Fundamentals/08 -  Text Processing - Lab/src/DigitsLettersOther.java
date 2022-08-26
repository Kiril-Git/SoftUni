import java.util.Scanner;

public class DigitsLettersOther {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String letters = "";
        String digits = "";
        String other = "";

        for (int i = 0; i < input.length(); i++) {

            if (Character.isDigit(input.charAt(i))) {

                digits += input.charAt(i);

            } else if (Character.isLetter(input.charAt(i))) {

                letters += input.charAt(i);
            }
            else {
                other += input.charAt(i);
            }
        }
        System.out.println(digits);
        System.out.println(letters);
        System.out.println(other);
    }
}
