import java.util.*;

public class Farmers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        Map<String, Integer> mapList = new TreeMap<>();
        Map<String, Integer> mapJunkList = new LinkedHashMap<>();

        int Shards = 0;
	    int Fragments = 0;
	    int Motes = 0;

        boolean won = false;

        for (int i = 0; i < input.length; i+=2) {

                String type = input[i+1].toLowerCase();
                int quantity = Integer.parseInt(input[i]);

            switch (type){
                case "shards":
                    mapList.putIfAbsent(type, 0);
                    mapList.put(type, mapList.get(type)+quantity);
                    Shards += quantity;
                    if (Shards >= 250){
                        System.out.println("Shadowmourne obtained!");
                        Shards -= 250;
                        mapList.put(type, mapList.get(type) - 250);
                    }

                    break;
                case "fragments":
                    mapList.putIfAbsent(type, 0);
                    mapList.put(type, mapList.get(type)+quantity);
                    Fragments += quantity;
                    if (Fragments >= 250){
                        System.out.println("Valanyr obtained!");
                        Fragments -= 250;
                        mapList.put(type, mapList.get(type) - 250);
                    }

                    break;
                case "motes":
                    mapList.putIfAbsent(type, 0);
                    mapList.put(type, mapList.get(type)+quantity);
                    Motes += quantity;
                    if (Motes >= 250){
                        System.out.println("Dragonwrath obtained!");
                        Motes -= 250;
                        mapList.put(type, mapList.get(type) - 250);
                    }
                    break;
                default:
                    mapJunkList.putIfAbsent(type, 0);
                    mapJunkList.put(type, mapJunkList.get(type)+quantity);
            }
        }
        System.out.println("shards: " + Shards);
        System.out.println("fragments: " + Fragments);
        System.out.println("motes: " + Motes);

//        mapList.forEach((key, value) -> System.out.printf("%s -> %d\n", key, value));
        mapJunkList.forEach((key, value) -> System.out.printf("%s -> %d\n", key, value));

    }
}

