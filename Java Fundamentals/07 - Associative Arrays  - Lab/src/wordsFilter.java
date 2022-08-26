import java.util.Arrays;
import java.util.Scanner;

public class wordsFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = Arrays.stream(scanner.nextLine().split(" "))
                .filter(el -> el.length() % 2 ==0)
                .toArray(String[]::new);


        System.out.println(String.join(System.lineSeparator(), words));
    }
}
