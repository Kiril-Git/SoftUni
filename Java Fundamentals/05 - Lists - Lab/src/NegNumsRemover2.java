import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class NegNumsRemover2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numsList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        Collections.reverse(numsList);

        numsList.removeIf(e -> e < 0);

            if (numsList.isEmpty()){
                System.out.println("empty");
            }
            else {
                System.out.println(numsList.toString().replaceAll("[\\[\\],]",  ""));
        }
    }
}

