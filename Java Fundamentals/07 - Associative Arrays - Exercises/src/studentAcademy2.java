import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class studentAcademy2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, ArrayList<Double>> mapList = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {

            String name = scanner.nextLine();;
            Double grade = Double.parseDouble(scanner.nextLine());

//            mapList.get(product).set(1, mapList.get(product).get(1) + quantity);

                mapList.putIfAbsent(name, new ArrayList<>());
                mapList.get(name).add(grade);

        }
        mapList.entrySet().stream().
                filter(s -> s.getValue().stream().mapToDouble(x -> x).average().orElse(0.0) >= 4.5)
                .forEach(entry -> {
                    double avGrade = entry.getValue().stream().mapToDouble(x -> x).average().orElse(0.0);
                    System.out.printf("%s -> %.2f\n", entry.getKey(), avGrade);
                });

//        mapList.forEach((k, v) -> System.out.printf("%s -> %.2f\n", k, v.get(0) / v.get(1)));


    }
}
