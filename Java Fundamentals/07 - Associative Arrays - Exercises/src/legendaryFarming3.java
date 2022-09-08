import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class legendaryFarming3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> trophyList = new LinkedHashMap<>();
        trophyList.put("shards", 0);
        trophyList.put("fragments", 0);
        trophyList.put("motes", 0);

        Map<String, String> list = new LinkedHashMap<>();
        list.put("shards", "Shadowmourne obtained!");
        list.put("fragments", "Valanyr obtained!");
        list.put("motes", "Dragonwrath obtained!");

        String value = "";
        boolean won = false;

        while (!won) {

            String[] line = scanner.nextLine().split(" ");

            for (int i = 0; i < line.length; i += 2) {

                int quantity = Integer.parseInt(line[i]);
                String trophy = line[i + 1].toLowerCase();

                    trophyList.putIfAbsent(trophy, 0);
                    trophyList.put(trophy, trophyList.get(trophy) + quantity);

                if (trophy.equals("shards") || trophy.equals("fragments") || trophy.equals("motes")) {
                    if (trophyList.get(trophy) >= 250) {
                        trophyList.put(trophy, trophyList.get(trophy) - 250);
                        value = trophy;
                        won = true;
                        break;
                    }
                }
            }
        }
        System.out.println(list.get(value));
        trophyList.forEach((k, v) -> System.out.printf("%s: %d\n", k, v));
    }
}
