import java.util.Scanner;

public class IntegerOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int third = scanner.nextInt();
        int forth = scanner.nextInt();

        int sum = (first + second) / third * forth;

        System.out.println(sum);
    }
}
