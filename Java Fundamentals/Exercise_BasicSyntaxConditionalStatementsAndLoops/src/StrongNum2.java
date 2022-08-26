import java.util.Scanner;

public class StrongNum2 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());
        int fact = 1;
        int sum = 0;
        int num = input;

        while (num > 0){

            int lastDgt = num % 10;
            num = num / 10;

            for (int i = 1; i <= lastDgt ; i++) {

                 fact *= i;
            }
            sum += fact;
            fact = 1;
        }
        if (input == sum) {
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
    }
}
