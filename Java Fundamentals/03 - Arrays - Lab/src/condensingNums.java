import java.util.Arrays;
import java.util.Scanner;

public class condensingNums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numsArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        while (numsArr.length > 1) {
            int[] newArr = new int[numsArr.length-1];

            for (int i = 0; i < newArr.length; i++) {

                newArr[i] = numsArr[i] + numsArr[i + 1];
            }
            numsArr = newArr;
        }

        System.out.println(numsArr[0]);
    }
}

//        double[] fltsArr = Arrays
//                .stream(scanner.nextLine().split(" "))
//                        .mapToDouble(Double::parseDouble)
//                .toArray();