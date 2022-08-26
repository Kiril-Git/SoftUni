import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // write your code here

        int n = Integer.parseInt(scanner.nextLine());

        int[] numbers = new int[n];

        for (int i = 0; i < numbers.length; i++) {

            numbers[i] = Integer.parseInt(scanner.nextLine());

        }
    }
}