import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Mining {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        ArrayList<String> inputln = new ArrayList<>();

        Map<String, Integer> mapList = new LinkedHashMap<>();

        while (!input.equals("stop")){

            inputln.add(input);

             input = scanner.nextLine();
            }
        for (int i = 0; i < inputln.size(); i+=2) {

            String mineral = inputln.get(i);
            Integer quantity = Integer.valueOf(inputln.get(i+1));

            if (mapList.containsKey(mineral)){
                mapList.put(mineral, mapList.get(mineral)+quantity);     //  mapList.get(el) ни дава value-то
            }
            else {
                mapList.put(mineral, quantity);
            }
        }
        mapList.forEach((key, value) -> System.out.printf("%s -> %d\n", key, value));
    }
}

