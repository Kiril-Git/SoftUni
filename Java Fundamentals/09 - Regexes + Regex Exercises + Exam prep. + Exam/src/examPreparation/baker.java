package examPreparation;

import java.util.*;

public class baker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, Integer> mapList = new LinkedHashMap<>();

        int sold = 0;

        while (!input.equals("Complete")){

            String[] line = input.split(" ");

            String command = line[0];
            String product = line[2];
            int quantity = Integer.parseInt(line[1]);
            if (quantity < 1){
                input = scanner.nextLine();
                continue;
            }
            switch (command) {

                case "Receive":
                if (mapList.containsKey(product)) {
                    mapList.put(product, mapList.get(product) + quantity);
                } else {
                    mapList.put(product, quantity);
                }
                break;
                case "Sell":
                    if (mapList.containsKey(product)) {
                        int temp = mapList.get(product).intValue();
                        if (quantity < temp) {
                            mapList.put(product, mapList.get(product) - quantity);
                            sold += quantity;
                            System.out.printf("You sold %d %s.\n", quantity, product);
                        } else if (quantity == temp) {
                            sold += quantity;
                            mapList.remove(product);
                            System.out.printf("You sold %d %s.\n", quantity, product);
                        }else if (quantity > temp) {
                            sold += quantity - temp;
                            mapList.remove(product);
                            System.out.printf("There aren't enough %s. You sold " +
                                    "the last %d of them.\n", product, temp);
                        }
                    } else {
                            System.out.printf("You do not have any %s.\n", product);
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        mapList.forEach((key, value) -> System.out.printf
                ("%s: %d\n", key, value));
        System.out.printf("All sold: %d goods", sold);
    }
}
