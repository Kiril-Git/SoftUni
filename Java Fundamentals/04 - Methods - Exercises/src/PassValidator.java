import java.util.Scanner;

public class PassValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine().toLowerCase();

        lengthControl(text);
        charControl(text);
        digitsControl(text);
    }
    private static void digitsControl(String text) {

        int count = 0;
        for (char digit : text.toCharArray()) {

            if (Character.isDigit(digit)){
                count++;
            }
        }
        if (count < 2){
            System.out.println("Password must have at least 2 digits");
        }
    }
    private static void charControl(String text) {

        int count = 0;
        for (char symbol : text.toCharArray()) {
            if (!Character.isLetterOrDigit(symbol)){
                count++;
            }
        }
        if (count > 0){
            System.out.println("Password must consist only of letters and digits");
        }
    }
    private static void lengthControl(String text) {

        int count = 0;
        for (char symbol : text.toCharArray()) {
            count++;
        }
        if (count < 6 || count > 10){
            System.out.println("Password must be between 6 and 10 characters");
        }
    }
}
