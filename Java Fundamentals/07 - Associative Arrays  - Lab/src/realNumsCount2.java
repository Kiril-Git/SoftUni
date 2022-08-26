import java.util.*;
import java.util.stream.Collectors;

public class realNumsCount2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> numsList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Double::parseDouble)
                .collect(Collectors.toList());

        Map<Double, Integer> numsMap = new TreeMap<>();

        for (Double el : numsList){
            if (!numsMap.containsKey(el)){
                numsMap.put(el, 0);
            }
            numsMap.put(el, numsMap.get(el) +1);
        }
        for (Map.Entry<Double, Integer>entry : numsMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
