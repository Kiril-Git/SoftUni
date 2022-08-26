package examPreparation;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class plantDiscovery2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, ArrayList<Double>> mapList = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {

            String input = scanner.nextLine();

            String[] line = input.split("<->");

            String plant = line[0];
            String rarityStr = line[1];
            Double rarity = Double.parseDouble(rarityStr);
            Double rating = 0.00;

            if (mapList.containsKey(plant)){
                mapList.get(plant).set(0, mapList.get(plant).get(0) + rarity);
            }
            else {
                mapList.put(plant, new ArrayList<>());
                mapList.get(plant).add(rarity);
                mapList.get(plant).add(rating);
            }
        }
        mapList.forEach((key, value) -> System.out.printf("%s -> %.2f\n", key, value.get(0), value.get(1)));
    }
    static class plantData{

        private int rarity;
        private double rating;

        public plantData(int rarity, double rating) {
            this.rarity = rarity;
            this.rating = rating;
        }
    }
}
//      pNtmxJAC