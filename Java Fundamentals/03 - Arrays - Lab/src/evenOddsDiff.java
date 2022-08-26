import java.util.Arrays;
import java.util.Scanner;

public class evenOddsDiff {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numsArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int even = 0;
        int odds = 0;

        for (int i = 0; i < numsArr.length; i++) {

            if (numsArr[i] % 2 == 0) {
                even += numsArr[i];
            }
            else {
                odds += numsArr[i];
            }
        }
        System.out.println(even - odds);
    }
}

//        double[] fltsArr = Arrays
//                .stream(scanner.nextLine().split(" "))
//                        .mapToDouble(Double::parseDouble)
//                .toArray();

//            System.out.print(numsArr[i] + " ");
