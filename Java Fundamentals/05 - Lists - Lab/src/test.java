import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> namesList = new ArrayList<>();
        namesList.add("Ivan");
        namesList.add("Donga");
        namesList.add("Buzema");

        System.out.println(namesList);

        for (String name : namesList) {

            System.out.println(name);

        }
    }
}
