import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class studentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, ArrayList<Double>> mapList = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {

            String name = scanner.nextLine();;
            Double grade = Double.parseDouble(scanner.nextLine());
            Double reps = 0.0;

//            mapList.get(product).set(1, mapList.get(product).get(1) + quantity);

            if (mapList.containsKey(name)){
                mapList.get(name).set(0, mapList.get(name).get(0) + grade);
                mapList.get(name).set(1, mapList.get(name).get(1) + 1);
            }
            else {
                mapList.put(name, new ArrayList<>());
                mapList.get(name).add(grade);
                mapList.get(name).add(1.0);
            }
            reps++;
        }

        mapList.forEach((k, v) -> System.out.printf("%s -> %.2f\n", k, v.get(0) / v.get(1)));

//        mapList.entrySet().stream().forEach(entry -> {
//            double avGrade = entry.getValue().stream().mapToDouble(x -> x).average().orElse(0.0);
//            if (avGrade >= 4.5) {
//                System.out.printf("%s -> %.2f\n", entry.getKey(), avGrade);
//            }
//        });
    }
}
