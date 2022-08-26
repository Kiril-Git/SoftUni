import java.util.Scanner;

public class EvenNumSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // write your code here

        String[] input = scanner.nextLine().split(" ");

        int[] nums = new int[input.length];
        for (int i = 0; i < input.length; i++) {

            nums[i] = Integer.parseInt(input[i]);

        }


    }
}