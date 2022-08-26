package examPreparation;

import java.util.*;

public class plantDiscovery {
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
            Double rating = 0.0;

            if (mapList.containsKey(plant)){
                mapList.get(plant).set(0, mapList.get(plant).get(0) + rarity);
            }
            else {
                mapList.put(plant, new ArrayList<>());
                mapList.get(plant).add(rarity);
                mapList.get(plant).add(rating);
            }
        }
        String input = scanner.nextLine();

        while (!input.equals("Exhibition")){

            String[] line = input.split(" ");

            String command = line[0];
            String plant = line[1];
            Double temp = 0.0;

            if (!mapList.containsKey(plant)){
                System.out.println("error");
            }
            switch (command){

                case "Rate:":
                    String ratingStr = line[3];
                    temp = Double.parseDouble(ratingStr);
                    Double rating = mapList.get(plant).get(1);

                    if (rating == 0) {
                        mapList.get(plant).set(1, temp);
                    }
                    else {
                        temp = (temp + rating)/2;
                        mapList.get(plant).set(1, temp);
                    }
                    break;

                case "Update:":
                    String rarityStr = line[3];
                    temp = Double.parseDouble(rarityStr);

                    mapList.get(plant).set(0, temp);
                    break;

                case "Reset:":
                    temp = 0.0;

                    mapList.get(plant).set(1, temp);
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.println("Plants for the exhibition:");
        mapList.forEach((key, value) -> System.out.printf
                ("- %s; Rarity: %.0f; Rating: %.2f\n", key, value.get(0), value.get(1)));
    }
}
//      pNtmxJAC