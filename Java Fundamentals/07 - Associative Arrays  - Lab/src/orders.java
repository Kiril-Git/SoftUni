import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, ArrayList<Double>> mapList = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("buy")) {

            String[] data = input.split(" ");
            double sum = 0;

            String type = data[0];
            double price = Double.parseDouble(data[1]);
            double quantity = Double.parseDouble(data[2]);

            if (mapList.containsKey(type)) {

                mapList.get(type).set(0, price);
                mapList.get(type).set(1, mapList.get(type).get(1) + quantity);
            }
            else {
                mapList.put(type, new ArrayList<>());
                mapList.get(type).add(price);
                mapList.get(type).add(quantity);
            }
            input = scanner.nextLine();
        }
        mapList.forEach((key, value) -> System.out.printf("%s -> %.2f\n", key, value.get(0) * value.get(1)));
    }
}

