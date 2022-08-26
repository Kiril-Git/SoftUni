import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numPpl = scanner.nextDouble();
        double capacity = scanner.nextDouble();

            System.out.printf("%.0f", Math.ceil(numPpl / capacity));
        }
    }


