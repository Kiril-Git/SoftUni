import java.util.Scanner;

public class FactorialDivision2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        long fact1 = calcFact(n1);
        long fact2 = calcFact(n2);

        System.out.printf("%.2f", 1.0 * calcFact(n1)  / calcFact(n2));
    }
    private static long calcFact(int num) {
        long sum = 1;
        for (int i = 1; i <= num ; i++) {

            sum *= i;
        }
        return sum;
    }
}

