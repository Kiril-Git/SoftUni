import java.util.Arrays;
import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] elements = Arrays.stream(scanner.nextLine()
                .split(" ")).mapToInt(e-> Integer.parseInt(e))
                .toArray();
        int n = scanner.nextInt();

        for (int i = 0; i < elements.length; i++) {

            for (int j = i + 1; j < elements.length; j++) {

                if (elements[i] + elements[j] == n) {

                    System.out.println(elements[i] + " " + elements[j]);
                }
            }
        }
    }
}





