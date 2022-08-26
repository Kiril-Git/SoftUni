import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class train2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] train = new int[n];

        int sum = 0;

        for (int i = 0; i < train.length; i++) {

            train[i] = Integer.parseInt(scanner.nextLine());

            sum += train[i];

            System.out.print(train[i] + " ");
        }
        //  Arrays.stream(train).forEach(n -> System.out.print(n + " "));

        System.out.printf("\n%d", sum);
    }
}



