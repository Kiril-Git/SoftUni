import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        int rear = 1;
        int sum = 0;

        while (num > 0){

            rear = num % 10;
            sum += rear;
            num = num / 10;
        }
        System.out.println(sum);
    }
}
