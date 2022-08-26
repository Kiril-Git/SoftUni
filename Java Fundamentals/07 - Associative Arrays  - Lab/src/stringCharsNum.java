import java.util.*;
import java.util.stream.Collectors;

public class stringCharsNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputLn = scanner.nextLine();

        Map<Character, Integer> mapList = new LinkedHashMap<>();

        for (char el : inputLn.toCharArray()){

            if (el == ' '){
                continue;
            }
            else if (mapList.containsKey(el)){

                mapList.put(el, mapList.get(el) + 1);
            }
            else {
                mapList.put(el, 1);
            }
        }
        for (Map.Entry<Character, Integer>entry : mapList.entrySet()) {
            System.out.printf("%s -> %d\n", entry.getKey(), entry.getValue());
            }
    }
}

