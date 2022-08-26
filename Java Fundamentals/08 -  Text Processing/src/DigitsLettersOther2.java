import java.util.Scanner;

public class DigitsLettersOther2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        StringBuilder letters = new StringBuilder();
        StringBuilder digits = new StringBuilder();
        StringBuilder other = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {

            char temp = input.charAt(i);

            if (Character.isDigit(input.charAt(i))) {

                digits.append(temp);

            } else if (Character.isLetter(input.charAt(i))) {

                letters.append(temp);
            }
            else {
                other.append(temp);
            }
        }
        System.out.println(digits);
        System.out.println(letters);
        System.out.println(other);
    }
}

//  watch?v=7ovOUus4ST4
