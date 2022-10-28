package hotel;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String[] ln = input.split(" ");

        double price = Double.parseDouble(ln[0]);
        int days = Integer.parseInt(ln[1]);
        Season season = Season.valueOf(ln[2].toUpperCase());
        DiscountType type = DiscountType.valueOf(ln[3].toUpperCase());

        double total = priceCalculator.calcHolidayPrice(price, days, season, type);
        System.out.printf("%.2f", total);

    }
}
