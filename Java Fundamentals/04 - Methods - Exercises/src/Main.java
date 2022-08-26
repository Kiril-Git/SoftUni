import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            int sum = 0;
            int odds = 0;

            while (i > 0) {

                 int temp = i  % 10;

                if (temp % 2 != 0) {
                    odds++;
                }
                sum += temp;

                i /= 10;
            }
            if (sum % 3 == 0 & odds > 0) {
                System.out.println(sum);

            }
        }
    }
}
