import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //  Четем имената от конзолата
        //  Donga Kozhata Buzema

        List<String> fellasList = Arrays
                .stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());


        System.out.println(fellasList);
    }
}
