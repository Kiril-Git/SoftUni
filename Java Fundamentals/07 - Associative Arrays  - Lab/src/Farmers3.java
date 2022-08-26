import java.util.*;

public class Farmers3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> mapList = new LinkedHashMap<>();
        mapList.put("shards", 0);
        mapList.put("fragments", 0);
        mapList.put("motes", 0);

        boolean won = false;
        String trophy = "";

        while (!won) {
            String[] input = scanner.nextLine().split(" ");

            for (int i = 0; i < input.length; i += 2) {

                String type = input[i + 1].toLowerCase();
                int quantity = Integer.parseInt(input[i]);

                mapList.putIfAbsent(type, 0);
                mapList.put(type, mapList.get(type) + quantity);

                if (mapList.get(type) >= 250){

                        won = true;

                        switch (type) {
                            case "shards":
                                trophy = "Shadowmourne";
                                break;
                            case "fragments":
                                trophy = "Valanyr";
                                break;
                            case "motes":
                                trophy = "Dragonwrath";
                                break;
                            default:
                                continue;
                        }
                        System.out.println(trophy + " obtained!");
                        mapList.put(type, mapList.get(type) - 250);
                        break;
                }
            }
        }
        mapList.forEach((key, value) -> System.out.printf("%s: %d\n", key, value));
    }
}

