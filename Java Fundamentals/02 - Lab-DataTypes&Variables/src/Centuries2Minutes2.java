import java.util.Scanner;

public class Centuries2Minutes2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cent = Integer.parseInt(scanner.nextLine());

        int years = cent * 100;
        int days = (int) (years * 365.2422);
        int hours = days * 24;
        int min = hours * 60;

        System.out.printf("%d centuries = %d years = %d days = %d hours = %d minutes",
                cent, years, days, hours, min);

    }
}
