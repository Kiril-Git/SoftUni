import java.util.*;
import java.util.stream.Collectors;

public class odds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> inputList = Arrays.stream(scanner.nextLine().split(" "))
                .collect(Collectors.toList());

        Map<String, Integer> mapList = new LinkedHashMap<>();

        for (String el : inputList){
            String lowerCaseW = el.toLowerCase();
            if (mapList.containsKey(lowerCaseW)){
                mapList.put(lowerCaseW, mapList.get(lowerCaseW) + 1);
            }
            else {
                mapList.put(lowerCaseW, 1);
            }
        }
        List<String> odds = new ArrayList<>();
        for (Map.Entry<String, Integer>entry : mapList.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                odds.add(entry.getKey());
            }
            }
                System.out.println(String.join(", ", odds));
    }
}

