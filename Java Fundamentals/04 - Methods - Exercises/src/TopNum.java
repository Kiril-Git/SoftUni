import java.util.Scanner;

public class TopNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {

            if (divisible8Ctrl(i) & oddsCtrl(i)){
                System.out.println(i);
            }
        }
    }
    private static boolean divisible8Ctrl(int i) {

        int sum = 0;
        while (i > 0) {
            int temp = i % 10;
            sum += temp;
            i /= 10;
        }
        return sum % 8 == 0;
    }
    private static boolean oddsCtrl(int i) {

        while (i > 0) {
            int temp = i % 10;
            if (temp % 2 != 0) {
                return true;
            }
            i /= 10;
        }
        return false;
    }
}

