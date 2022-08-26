import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //  Четем имената от конзолата
        //  Donga Kozhata Buzema

        List<String> fellasList = new ArrayList<>();
        String[] fellas = scanner.nextLine().split("\\s+");

        for (int i = 0; i < fellas.length; i++) {
            fellasList.add(fellas[i]);
        }
        System.out.println(fellasList);
    }
}
