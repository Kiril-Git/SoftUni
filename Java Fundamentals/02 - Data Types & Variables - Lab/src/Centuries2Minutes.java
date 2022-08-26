import java.util.Scanner;

public class Centuries2Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cent = Integer.parseInt(scanner.nextLine());

        double years = cent * 100;
        double days = years * 365.2422;
        double hours = days * 24;
        double min = hours * 60;

        System.out.printf("%d centuries = %.0f years = %.0f days = %.0f hours = %.0f minutes",
                cent, years, days, hours, min);

    }
}
