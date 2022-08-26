import java.util.*;

public class Farmers2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> mapList = new LinkedHashMap<>();
        mapList.put("shards", 0);
        mapList.put("fragments", 0);
        mapList.put("motes", 0);

        Map<String, String> prize = new HashMap<>();
        prize.put("shards", "Shadowmourne");
        prize.put("fragments", "Valanyr");
        prize.put("motes", "Dragonwrath");

        boolean won = false;
        String trophy = "";

        while (!won) {
            String[] input = scanner.nextLine().split(" ");

            for (int i = 0; i < input.length; i += 2) {

                String type = input[i + 1].toLowerCase();
                int quantity = Integer.parseInt(input[i]);

                mapList.putIfAbsent(type, 0);
                mapList.put(type, mapList.get(type) + quantity);

                if (type.equals("shards") || type.equals("fragments") || type.equals("motes")) {

                    if (mapList.get(type) >= 250) {

                        mapList.put(type, mapList.get(type) - 250);
                        trophy = type;
                        won = true;
                        break;
                    }
                }
            }
        }
        System.out.println(prize.get(trophy) + " obtained!");

        mapList.forEach((key, value) -> System.out.printf("%s: %d\n", key, value));
    }
}

