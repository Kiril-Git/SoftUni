import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class test5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numsList = Arrays.stream(scanner.nextLine().split(" "))
                        .map(Integer::parseInt)
                                .collect(Collectors.toList());

        System.out.println();
    }
}



