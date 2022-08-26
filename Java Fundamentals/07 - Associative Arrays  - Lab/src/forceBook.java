import java.awt.*;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class forceBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, List<String>> mapList = new LinkedHashMap<>();

        int users = 0;

        while (!input.equals("Lumpawaroo")){

            if (input.contains("|")){
                String[] command = input.split(" \\| ");
                String side = command[0];
                String name = command[1];
                mapList.putIfAbsent(side, new ArrayList<>());
                boolean noneMatch = mapList.get(side)
                        .stream()
                        .noneMatch(el -> el.contains(name));
                if (noneMatch){
                    mapList.get(side).add(name);
                }
            }
            else if (input.contains("->")){
                String[] command = input.split(" -> ");
                String side = command[1];
                String name = command[0];
                mapList.forEach((k, v) -> v.remove(name));
                mapList.putIfAbsent(side, new ArrayList<>());
                mapList.get(side).add(name);
                System.out.printf("%s joins the %s side!\n", name, side);
            }
            input = scanner.nextLine();
        }
        mapList.forEach((k, v) -> {
            if (v.size() != 0) {
                System.out.printf("Side: %s, Members: %d\n", k, v.size());
                v.forEach(name -> System.out.printf("! %s\n", name));
            }
                });
    }
}
//        mapList.forEach((key, value) -> System.out.printf("%s -> %d\n", key, value));
