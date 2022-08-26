import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
	// write your code here
        Map<String, Integer> map = new TreeMap<>();

//                 Сортиране:                   TreeMap             азбучен ред или от по-малко към по-голямо
//                                              LinkedHashMap       по реда на добавяне
//                                              HashMap             от по-малко към по-голямо

        map.put("Donga", 2323);
        map.put("Buzema", 2222);
        map.put("Kozhata", 1717);

        map.remove("Buzema");

        map.put("Donga", 2424);

        if (!map.containsKey("Buzema")){
            System.out.println("Buzema in the shower.");
        }
        System.out.println();

//        alt + enter
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.printf("%s -> %d%n", entry.getKey(), entry.getValue());
        }
    }
}


