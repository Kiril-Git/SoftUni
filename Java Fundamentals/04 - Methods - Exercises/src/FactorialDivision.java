import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        System.out.printf("%.2f", 1.0 * calcFact1(n1)  / calcFact2(n2));
    }
    private static long calcFact1(int n1) {
        long sum = 1;
        for (int i = 1; i <=n1 ; i++) {

            sum *= i;
        }
        return sum;
    }
    private static long calcFact2(int n2) {
        long sum = 1;
        for (int i = 1; i <=n2 ; i++) {

            sum *= i;
        }
        return sum;
    }
}

