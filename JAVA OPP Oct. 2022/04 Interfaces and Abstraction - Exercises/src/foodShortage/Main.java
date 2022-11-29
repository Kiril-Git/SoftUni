package foodShortage;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Buyer> buyerMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String[] inputLn = scanner.nextLine().split(" ");

            Buyer buyer = null;
            String name = inputLn[0];
            int age = Integer.parseInt(inputLn[1]);

            switch (inputLn.length){

                case 4:
                    String id = inputLn[2];
                    String bd = inputLn[3];
                    buyer = new Citizen(name, age, id, bd);
                    break;
                case 3:
                    String group = inputLn[2];
                    buyer = new Rebel(name, age, group);
                    break;
                default:
                    break;
            }
            buyerMap.put(name, buyer);
        }

        String client = scanner.nextLine();

        while (!"End".equals(client)){

            Buyer buyer = buyerMap.get(client);

            if (buyer != null) {
                buyer.buyFood();
            }

            client = scanner.nextLine();
        }

        int sum = buyerMap.values().stream().mapToInt(Buyer::getFood).sum();
        System.out.println(sum);
    }
}
