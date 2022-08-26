import java.util.Arrays;
import java.util.Scanner;

public class reversNums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 11 13 15 17 19

        int n = Integer.parseInt(scanner.nextLine());

        int[] elsArr = new int[n];

        for (int i = 0; i < n; i++) {

            elsArr[i] = Integer.parseInt(scanner.nextLine());
        }
        for (int i = elsArr.length-1; i >= 0; i--) {

            System.out.print(elsArr[i] + " ");
        }
    }
}
