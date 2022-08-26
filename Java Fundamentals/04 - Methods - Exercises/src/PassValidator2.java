import java.util.Scanner;
public class PassValidator2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        if (!lengthControl(text)){
            System.out.println("Password must be between 6 and 10 characters");
        }
        if (!charControl(text)){
            System.out.println("Password must consist only of letters and digits");
        }
        if (!digitsControl(text)){
            System.out.println("Password must have at least 2 digits");
        }
        else if (lengthControl(text) & charControl(text) & digitsControl(text)){
            System.out.println("Password is valid");
        }
    }
    private static boolean digitsControl(String text) {
        int count = 0;
        for (char digit : text.toCharArray()) {
            if (Character.isDigit(digit)){
                count++;
            }
        }
        if (count < 2){
            return false;
        }
        else {
            return true;
        }
    }
    private static boolean charControl(String text) {
        int count = 0;
        for (char symbol : text.toCharArray()) {
            if (!Character.isLetterOrDigit(symbol)){
                count++;
            }
        }
        if (count > 0){
            return false;
        }
        else  {
            return true;
        }
    }
    private static boolean lengthControl(String text) {
        int count = 0;
        for (char symbol : text.toCharArray()) {
            count++;
        }
        if (count < 6 || count > 10){
            return false;
        }
        else {
            return true;
        }
    }
}
