import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, ArrayList<Double>> mapList = new LinkedHashMap<>();

        while (!input.equals("buy")){

            String[] line = input.split(" ");

            String product = line[0];
            Double price = Double.valueOf(line[1]);
            Double quantity = Double.valueOf(line[2]);

            if (mapList.containsKey(product)) {

                mapList.get(product).set(0, price);
                mapList.get(product).set(1, mapList.get(product).get(1) + quantity);
            }
            else {
                mapList.put(product, new ArrayList<>());
                mapList.get(product).add(price);
                mapList.get(product).add(quantity);
            }
            input = scanner.nextLine();
        }
        mapList.forEach((k, v) -> System.out.printf("%s -> %.2f\n", k, v.get(0) * v.get(1)));
    }
}
