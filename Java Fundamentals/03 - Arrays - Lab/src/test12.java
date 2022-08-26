import java.util.Scanner;

public class test12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 11 13 15 17 19

        int n = Integer.parseInt(scanner.nextLine());

        int[] numsArr = new int[n];

        for (int i = 0; i < numsArr.length; i++) {

            numsArr[i] = Integer.parseInt(scanner.nextLine());

            System.out.println(numsArr[i]);
        }
    }
}
