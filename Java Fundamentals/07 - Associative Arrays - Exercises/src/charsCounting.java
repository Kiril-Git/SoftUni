
//      mapList.forEach((k, v) -> System.out.printf("%s -> %d\n", k, v));

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class charsCounting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<Character, Integer> mapList = new LinkedHashMap<>();

        int nailedIt = 0;

        for (int i = 0; i < input.length(); i++) {

            char temp = input.charAt(i);

            if (temp == ' '){
                nailedIt++;
            }
            else if (mapList.containsKey(temp)){
                mapList.put(temp, mapList.get(temp)+1);
            }
            else {
                mapList.put(temp, 1);
            }
        }
        mapList.forEach((k, v) -> System.out.printf("%s -> %d\n", k, v));
    }
}
