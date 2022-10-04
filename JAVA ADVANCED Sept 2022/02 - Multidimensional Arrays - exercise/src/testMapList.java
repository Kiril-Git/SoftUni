import java.util.*;

public class testMapList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<Double>> mapList = new HashMap<>();

        List<Double> dongata = new ArrayList<>();

        dongata.add(23.5);
        dongata.add(17.0);
        dongata.add(8.5);
        mapList.put("Donga", dongata);



        System.out.println();
    }
}
