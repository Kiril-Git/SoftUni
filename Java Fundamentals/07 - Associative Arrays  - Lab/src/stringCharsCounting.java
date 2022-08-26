import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class stringCharsCounting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<Character, Integer> mapList = new HashMap<>();

        for (char el : input.toCharArray()) {

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
        mapList.forEach((key, value) -> System.out.printf("%c -> %d\n", key, value));
    }
}
