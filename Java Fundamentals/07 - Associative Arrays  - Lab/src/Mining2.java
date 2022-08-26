import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Mining2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, Integer> mapList = new LinkedHashMap<>();

        while (!input.equals("stop")){

            int quantity = Integer.parseInt(scanner.nextLine());

                if (!mapList.containsKey(input)){
                    mapList.put(input, quantity);
                }
                else {
                    mapList.put(input, mapList.get(input)+quantity);     //  mapList.get(el) ни дава value-то
                }
             input = scanner.nextLine();
            }
    }
}

