import java.util.Arrays;
import java.util.Scanner;

public class train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] train = new int[n];

        int sum = 0;

        for (int i = 0; i < train.length; i++) {

            train[i] = Integer.parseInt(scanner.nextLine());

            System.out.print(train[i] + " " );
            sum += train[i];
        }
        System.out.printf("\n%d", sum);
    }
}




