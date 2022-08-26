import java.util.Arrays;
import java.util.Scanner;

public class test14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 11 13 15 17 19


        int[] numsArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

//        double[] fltsArr = Arrays
//                .stream(scanner.nextLine().split(" "))
//                        .mapToDouble(Double::parseDouble)
//                .toArray();

        for (int i = 0; i < numsArr.length; i++) {

            System.out.print(numsArr[i] + " ");
        }
        System.out.println();
    }
}
