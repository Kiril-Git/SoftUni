import java.util.Scanner;

public class Pounds2Dollars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double gbp = scanner.nextDouble();

        double usd = gbp * 1.36;

        System.out.printf("%.3f", usd);
    }
}
