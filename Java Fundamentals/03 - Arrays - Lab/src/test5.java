import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class test5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userInput = scanner.nextLine();

        String[]  items = userInput.split(" ");

        int[] arr = Arrays.stream(items).mapToInt(e -> Integer.parseInt(e)).toArray();


        System.out.println();
    }
}
