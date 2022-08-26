import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class test {

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
        System.out.println();

//        (a -> a > 5)
//        Lambda operator ->
//        Read as "goes to"
//        The left side specifies the input parameters
        System.out.println("Enter the value below ↓");
        System.out.println(func(scanner.nextInt()));
    }
    //        x -> x / 2
static int func(int x)
{return x / 2;}
}


