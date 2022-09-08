import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class legendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Map<String, Integer> trophyList = new LinkedHashMap<>();
        trophyList.put("shards", 0);
        trophyList.put("fragments", 0);
        trophyList.put("motes", 0);

        Map<String, Integer> junkList = new LinkedHashMap<>();

        boolean won = false;

        while (!won) {

            String[] line = scanner.nextLine().split(" ");

            for (int i = 0; i < line.length; i += 2) {

                int quantity = Integer.parseInt(line[i]);
                String trophy = line[i + 1].toLowerCase();

                if (trophy.equals("shards")) {
                    trophyList.putIfAbsent(trophy, 0);
                    trophyList.put(trophy, trophyList.get(trophy) + quantity);

                    if (trophyList.get(trophy) >= 250) {
                        System.out.println("Shadowmourne obtained!");
                        trophyList.put(trophy, trophyList.get(trophy) - 250);
                        won = true;
                        break;
                    }
                } else if (trophy.equals("fragments")) {
                    trophyList.putIfAbsent(trophy, 0);
                    trophyList.put(trophy, trophyList.get(trophy) + quantity);

                    if (trophyList.get(trophy) >= 250) {
                        System.out.println("Valanyr obtained!");
                        trophyList.put(trophy, trophyList.get(trophy) - 250);
                        won = true;
                        break;
                    }
                } else if (trophy.equals("motes")) {
                    trophyList.putIfAbsent(trophy, 0);
                    trophyList.put(trophy, trophyList.get(trophy) + quantity);

                    if (trophyList.get(trophy) >= 250) {
                        System.out.println("Dragonwrath obtained!");
                        trophyList.put(trophy, trophyList.get(trophy) - 250);
                        won = true;
                        break;

                    }
                } else {
                    junkList.putIfAbsent(trophy, 0);
                    junkList.put(trophy, junkList.get(trophy) + quantity);
                }
            }
        }
        trophyList.forEach((k, v) -> System.out.printf("%s: %d\n", k, v));
        junkList.forEach((k, v) -> System.out.printf("%s: %d\n", k, v));
    }
}
