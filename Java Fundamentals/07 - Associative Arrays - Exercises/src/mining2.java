//      mapList.putIfAbsent(input, 0);
//          mapList.put(input, mapList.get(input)+quantity);

//      mapList.forEach((k, v) -> System.out.printf("%s -> %d\n", k, v));

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class mining2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, Integer> mapList = new LinkedHashMap<>();

        while (!input.equals("stop")){

            int quantity = Integer.parseInt(scanner.nextLine());

            mapList.putIfAbsent(input, 0);
            mapList.put(input, mapList.get(input)+quantity);

            input = scanner.nextLine();
        }
        mapList.forEach((k, v) -> System.out.printf("%s -> %d\n", k, v));
    }
}
