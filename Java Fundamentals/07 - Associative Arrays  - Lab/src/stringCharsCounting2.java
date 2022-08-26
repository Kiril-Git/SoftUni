import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class stringCharsCounting2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<Character, Integer> mapList = new LinkedHashMap<>();

        for (int i = 0; i < input.length(); i++) {
            
            char el = input.charAt(i);

            if (el == ' '){
                continue;
            }
            else if (mapList.containsKey(el)){
                mapList.put(el, mapList.get(el)+1);     //  mapList.get(el) ни дава value-то
            }
            else {
                mapList.put(el, 1);
            }
        }
//        for (Map.Entry<Character, Integer>entry : mapList.entrySet()) {
//            System.out.printf("%s -> %d\n", entry.getKey(), entry.getValue());
//        }
        mapList.forEach((key, value) -> System.out.printf("%c -> %d\n", key, value));
    }
}
