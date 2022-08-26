import java.util.*;

public class studentAcademy2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<Double>> mapList = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {

            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

           mapList.putIfAbsent(name, new ArrayList<>());
           mapList.get(name).add(grade);
        }

        mapList.forEach((key, value) -> {
            double averageGrade = value
                    .stream()
                    .mapToDouble(x -> x)
                    .average()
                    .orElse(0.0);
            if (averageGrade >= 4.5){
                System.out.printf("%s -> %.2f\n", key, averageGrade);
            }
                });
    }
}
