import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

//mapList.forEach((k, v) -> {
//        double avGrade = v.stream().mapToDouble(x -> x).average().orElse(0.0);
//        if (avGrade >= 4.5) {
//        System.out.printf("%s -> %.2f\n", k, avGrade);
//        }
//        });

public class studentAcademy3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, ArrayList<Double>> mapList = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {

            String name = scanner.nextLine();
            ;
            Double grade = Double.parseDouble(scanner.nextLine());
            Double reps = 0.0;

//            mapList.get(product).set(1, mapList.get(product).get(1) + quantity);


            mapList.putIfAbsent(name, new ArrayList<>());
            mapList.get(name).add(grade);
        }

//        mapList.forEach((k, v) -> System.out.printf("%s -> %.2f\n", k, v.get(0) / v.get(1)));

        mapList.forEach((k, v) -> {
            double avGrade = v.stream().mapToDouble(x -> x).average().orElse(0.0);
            if (avGrade >= 4.5) {
                System.out.printf("%s -> %.2f\n", k, avGrade);
            }
        });
    }
}
