import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class matchFullName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Pattern patt = Pattern.compile("\\b[A-Z][a-z]+ [A-Z][a-z]+\\b");

        Matcher match = patt.matcher(input);

        while (match.find()){

            String name = match.group();

            System.out.print(name + " ");
        }
    }
}
