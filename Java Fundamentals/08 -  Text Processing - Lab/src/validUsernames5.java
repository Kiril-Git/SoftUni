import java.util.Arrays;
import java.util.Scanner;

public class validUsernames5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Arrays.stream(scanner.nextLine().split(", "))
                .filter(username -> username.matches("[a-zA-z_\\-\\d]{3,16}+"))
                .forEach(System.out::println);
    }
}
