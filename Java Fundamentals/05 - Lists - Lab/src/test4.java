import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class test4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputLine = scanner.nextLine();

        List<String> items = Arrays.stream(inputLine.split(" ")).collect(Collectors.toList());

        List<Integer> numsList = new ArrayList<>();

        for (int i = 0; i < items.size(); i++) {

            numsList.add(Integer.parseInt(items.get(i)));
        }


        System.out.println();
    }
}
