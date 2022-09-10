package orders2;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, product> mapList = new LinkedHashMap<>();

        while (!input.equals("buy")){

            String[] line = input.split(" ");

            String productName = line[0];
            Double price = Double.valueOf(line[1]);
            Double quantity = Double.valueOf(line[2]);

            if (mapList.containsKey(productName)){

                mapList.get(productName).setPrice(price);
                mapList.get(productName).setQuantity(mapList.get(productName).getQuantity() + quantity);
            }
            else {
                mapList.put(productName, new product(productName, price, quantity));
            }
            input = scanner.nextLine();
        }
        mapList.forEach((k, v) -> System.out.printf("%s %s", k, v));
    }
}
