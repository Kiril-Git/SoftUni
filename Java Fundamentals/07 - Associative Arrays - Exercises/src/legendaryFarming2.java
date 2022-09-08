import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class legendaryFarming2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> trophyList = new LinkedHashMap<>();
        trophyList.put("shards", 0);
        trophyList.put("fragments", 0);
        trophyList.put("motes", 0);

        Map<String, Integer> junkList = new LinkedHashMap<>();

        String value = "";
        String prize = "";
        boolean won = false;

        while (!won) {

            String[] line = scanner.nextLine().split(" ");

            for (int i = 0; i < line.length; i += 2) {

                int quantity = Integer.parseInt(line[i]);
                String trophy = line[i + 1].toLowerCase();

                if (trophy.equals("shards") || trophy.equals("fragments") || trophy.equals("motes")){
                    trophyList.putIfAbsent(trophy, 0);
                    trophyList.put(trophy, trophyList.get(trophy) + quantity);

                    if (trophyList.get(trophy) >= 250) {
                        trophyList.put(trophy, trophyList.get(trophy) - 250);
                        value = trophy;
                        won = true;
                        break;
                    }
                    }
                else {
                    junkList.putIfAbsent(trophy, 0);
                    junkList.put(trophy, junkList.get(trophy) + quantity);
                }
            }
        }
        if (value.equals("shards")){
            prize = "Shadowmourne";
        }
        else if (value.equals("fragments")){
            prize = "Valanyr";
        }
        else if (value.equals("motes")){
            prize = "Dragonwrath";
        }
        System.out.println(prize + " obtained!");
        trophyList.forEach((k, v) -> System.out.printf("%s: %d\n", k, v));
        junkList.forEach((k, v) -> System.out.printf("%s: %d\n", k, v));
    }
}
