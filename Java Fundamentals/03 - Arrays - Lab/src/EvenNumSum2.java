import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class EvenNumSum2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // write your code here

        String[] input = scanner.nextLine().split(" ");

        int[] numsArray = Arrays.stream(input)
                .mapToInt(element -> Integer.parseInt(element))
                .toArray();

        int evenSum = 0;
        int oddSum = 0;

        for (int number : numsArray){

            if (number % 2 == 0){

                evenSum += number;
            }
            else {
                oddSum += number;
            }
        }
        System.out.println(evenSum - oddSum);

    }
}