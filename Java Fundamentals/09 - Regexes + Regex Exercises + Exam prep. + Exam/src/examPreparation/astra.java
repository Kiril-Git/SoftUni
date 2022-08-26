package examPreparation;

import java.awt.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class astra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "([\\|#])(?<product>[A-Z a-z]*)\\1" +
                "(?<expires>[\\d]{2}\\/[\\d]{2}\\/[\\d]{2})\\1(?<calories>[\\d]{1,5})\\1";

        Pattern pattern = Pattern.compile(regex);
        String input = scanner.nextLine();
        Matcher matcher = pattern.matcher(input);
        List<Food> list = new LinkedList<>();

        String product = "";
        String expires = "";
        int calories = 0;
        int days = 0;
        int sum = 0;
        int total = 0;

       while (matcher.find()) {

            product = matcher.group(2);
            expires = matcher.group(3);
            calories = Integer.parseInt(matcher.group(4));

            sum += calories;

            Food temp = new Food(product, expires, calories);
            list.add(temp);

            days = list.stream().mapToInt(Food::getCalories).sum()/2000;

//            System.out.println(product + " " + expires + " " + calories);
        }
        total = sum / 2000;
        System.out.printf("You have food to last you for: %d days!\n", days);
        list.forEach(System.out::println);

    }
    static class Food{
        String product;
        String expires;
        int calories;

        public Food(String product, String expires, int calories) {
            this.product = product;
            this.expires = expires;
            this.calories = calories;
        }

        public String getProduct() {
            return product;
        }

        public void setProduct(String product) {
            this.product = product;
        }

        public String getExpires() {
            return expires;
        }

        public void setExpires(String expires) {
            this.expires = expires;
        }

        public int getCalories() {
            return calories;
        }

        public void setCalories(int calories) {
            this.calories = calories;
        }

        @Override
        public String toString() {
            return String.format("Item: %s, Best before: %s," +
                    " Nutrition: %d", this.product, this.expires, this.calories);
        }
    }
}
