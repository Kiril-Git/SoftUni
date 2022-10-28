package hotel;

public class priceCalculator {

    public static double calcHolidayPrice
            (double price1day, int days, Season season, DiscountType discountType){

        double total = price1day * days;

        total *= season.getCoefficient();

        total = total - total * (discountType.getPercent() / 100);

        return total;
    }
}
