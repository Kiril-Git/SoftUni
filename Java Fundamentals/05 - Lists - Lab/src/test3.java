import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Integer> numsList = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            int temp = Integer.parseInt(scanner.nextLine());

            numsList.add(temp);
        }
        for (int i : numsList) {
            System.out.print(" " + i);
            
        }    }
}
