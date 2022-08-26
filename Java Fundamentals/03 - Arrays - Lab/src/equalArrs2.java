import java.util.Arrays;
import java.util.Scanner;

public class equalArrs2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numsArr1 = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] numsArr2 = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int sum = 0;
        int diff = -1;

        for (int i = 0; i < numsArr1.length; i++) {
            if (numsArr1[i]  != numsArr2[i]) {
                diff = i;
                break;
            }
            sum += numsArr1[i];
        }
        if (diff >= 0){
            System.out.printf("Arrays are not identical. Found difference at %d index.\n", diff);
        }else
        {
            System.out.println("Arrays are identical. Sum: " + sum);
        }
    }
}

//        double[] fltsArr = Arrays
//                .stream(scanner.nextLine().split(" "))
//                        .mapToDouble(Double::parseDouble)
//                .toArray();

//            System.out.print(numsArr[i] + " ");
