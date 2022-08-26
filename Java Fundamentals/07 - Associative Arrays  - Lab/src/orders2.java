import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class orders2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, Type> mapList = new LinkedHashMap<>();

        while (!input.equals("buy")) {

            String[] data = input.split(" ");
            double sum = 0;

            String name = data[0];
            double price = Double.parseDouble(data[1]);
            double quantity = Double.parseDouble(data[2]);

            if (mapList.containsKey(name)) {

                mapList.get(name).setPrice(price);
                mapList.get(name).setQuantity(mapList.get(name).getQuantity() + quantity);
            }
            else {
                mapList.put(name, new Type(name, price, quantity));
            }
            input = scanner.nextLine();
        }
        mapList.forEach((key, value) -> System.out.printf("%s -> %.2f\n", key, value.getPrice() * value.getQuantity()));
    }

    static class Type{

        String name;
        double price;
        double quantity;

        public Type(String name, double price, double quantity) {
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public double getQuantity() {
            return quantity;
        }

        public void setQuantity(double quantity) {
            this.quantity = quantity;
        }
    }
}

