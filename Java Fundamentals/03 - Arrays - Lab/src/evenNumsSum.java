import java.util.Arrays;
import java.util.Scanner;

public class evenNumsSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 11 13 15 17 19

        int[] numsArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int sum = 0;
        int diff = 0;

        for (int i = 0; i < numsArr.length; i++) {

            if (numsArr[i] % 2 == 0) {
                sum += numsArr[i];
            }
//            System.out.print(numsArr[i] + " ");
        }
        System.out.println(sum);
    }
}

//        double[] fltsArr = Arrays
//                .stream(scanner.nextLine().split(" "))
//                        .mapToDouble(Double::parseDouble)
//                .toArray();