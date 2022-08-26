import java.util.Scanner;
public class evenOddsMultiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int num = Math.abs(number);

        getEvenOddsMultiplication(num);
//        getEvenSum(num);
//        getOddSum(num);
        System.out.println(getEvenOddsMultiplication(num));
    }
    private static int getEvenOddsMultiplication(int num) {

        return getEvenSum(num) * getOddSum(num);
    }
    private static int  getEvenSum (int num) {
        int evenSum = 0;
        while (num > 0) {
            int temp = num % 10;
            if (temp % 2 == 0){
                evenSum += temp;
            }
            num /= 10;
        }
        return evenSum;
    }
    private static int  getOddSum (int num) {
        int oddSum = 0;
        while (num > 0) {
            int temp = num % 10;
            if (temp % 2 != 0){
                oddSum += temp;
            }
            num /= 10;
        }
        return oddSum;
    }
}
