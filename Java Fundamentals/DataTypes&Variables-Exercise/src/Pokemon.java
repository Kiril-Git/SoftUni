import java.util.Scanner;

public class Pokemon {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int power = scanner.nextInt();
        int distance = scanner.nextInt();
        int exhaustion = scanner.nextInt();

        double halfP = 0.5 * power;
        int targets = 0;

        while (power >= distance){

            power -= distance;
            targets++;

            if (power == halfP && 0 != exhaustion){

                power /= exhaustion;
            }
        }
        System.out.println(power);
        System.out.println(targets);
    }
}
