import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> namesList = new ArrayList<>();
        namesList.add("Ivan");
        namesList.add("Donga");
        namesList.add("Buzema");
        namesList.add(2, "kozhata");

        namesList.set(0, "Mitko");

        if (namesList.contains("Donga"))

        System.out.println("Yes");
        System.out.println();

        for (String name : namesList) {

            System.out.println(name);

        }
    }
}
