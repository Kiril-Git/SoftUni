import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] firstArray = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();
        String[] input2 = scanner.nextLine().split(" ");

        int[] secondArray = new int[input2.length];

        int sum = 0;
        boolean equal = true;

        for (int i = 0; i < input2.length; i++) {

            secondArray[i] = Integer.parseInt(input2[i]);
        }
        for (int i = 0; i < secondArray.length; i++) {

            sum += secondArray[i];

            if (firstArray[i] != secondArray[i]) {

                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                equal = false;
                break;
            }
        }
        if (equal) {
            System.out.printf("Arrays are identical. Sum: %d", sum);
        }
    }
}
