import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class studentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Double> mapList = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {

            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            if (mapList.containsKey(name)){
                mapList.put(name, (mapList.get(name)+grade) / 2);     //  mapList.get(el) ни дава value-то
            }
            else {
                mapList.put(name, grade);
            }
        }
        mapList.entrySet().stream().filter(s -> s.getValue() >= 4.5)
                .forEach(entry -> {
                    System.out.printf("%s -> %.2f\n", entry.getKey(), entry.getValue());
                        });
//        mapList.forEach((key, value) -> System.out.printf("%s -> %.2f\n", key, value));
    }
}
