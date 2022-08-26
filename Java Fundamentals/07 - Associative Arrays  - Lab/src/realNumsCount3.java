import java.util.*;
import java.util.stream.Collectors;

public class realNumsCount3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> numsList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Double::parseDouble)
                .collect(Collectors.toList());

        Map<Double, Integer> numsMap = new TreeMap<>();

        for (Double el : numsList){
            if (numsMap.containsKey(el)){
                numsMap.put(el, numsMap.get(el) + 1);
            }
            else {
                numsMap.put(el, 1);
            }
        }
        for (Map.Entry<Double, Integer>entry : numsMap.entrySet()) {
            System.out.printf("%.0f -> %d\n", entry.getKey(), entry.getValue());
        }
    }
}

