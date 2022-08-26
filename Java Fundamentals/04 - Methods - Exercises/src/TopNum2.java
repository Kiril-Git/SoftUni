import java.util.Scanner;

public class TopNum2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        printTopNums(n);
    }
    private static void printTopNums(int n) {

        for (int i = 1; i <= n; i++) {

            int sum = 0;
            int ods = 0;

            while (i > 0){
                int temp = i;

                temp %= 10;
            if (temp % 2 != 0){
                ods++;
            }
            sum += temp;
             temp /= 10;
            }
            if (sum % 3 == 0 & ods > 0){
                System.out.println(sum);
            }


        }

    }


    }

