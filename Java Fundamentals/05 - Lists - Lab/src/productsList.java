import java.util.*;
import java.util.stream.Collectors;

public class productsList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<String> productsList = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            String product = scanner.nextLine();

            productsList.add(product);
        }
        Collections.sort(productsList);
//      Collections.reverse(productsList);           "reverse" не сортира - само обръща реда на подредбата

        for (int i = 0; i < n; i++) {
                System.out.printf("%d.%s\n", i+1, productsList.get(i) );
        }
    }
}

