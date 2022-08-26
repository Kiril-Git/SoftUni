import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
public class realNumCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] nums = Arrays
                .stream(scanner.nextLine()
                .split(" "))
                .mapToDouble(Double::parseDouble)
                .toArray();

        TreeMap<Double, Integer> counts = new TreeMap<>();

        for (double n : nums){
            if (!counts.containsKey(n)){
                counts.put(n, 0);
            }
            counts.put(n, counts.get(n) + 1);
        }

//        TreeMap<String, Integer> map = new TreeMap<>();

//                 Сортиране:                   TreeMap             азбучен ред или от по-малко към по-голямо
//                                              LinkedHashMap       по реда на добавяне
//                                              HashMap             от по-малко към по-голямо

//        alt + enter
        for (Map.Entry<Double, Integer> entry : counts.entrySet()) {
            DecimalFormat df = new DecimalFormat("#.#######");
            System.out.printf("%s -> %d%n", df.format(entry.getKey()), entry.getValue());
        }
    }
}


