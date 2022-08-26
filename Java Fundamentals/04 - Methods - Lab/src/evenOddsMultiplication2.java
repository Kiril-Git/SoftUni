import java.util.Scanner;

public class evenOddsMultiplication2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int num = Math.abs(number);

        getEvenOddsMultiplication(num);

        System.out.println(getEvenOddsMultiplication( num));
    }
    private static int getEvenOddsMultiplication(int num) {
        int evenSum = 0;
        int oddSum = 0;

        while (num > 0) {

            int temp = num % 10;
            if (temp % 2 == 0){
                evenSum += temp;
            }
            else {
                oddSum += temp;
            }
            num /= 10;
        }
        return evenSum * oddSum;
    }
}
