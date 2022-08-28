import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RandomizedWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> inputList = Arrays.stream(scanner.nextLine().split(" "))
                .collect(Collectors.toList());

        while (!inputList.isEmpty()) {

            Random rnd = new Random();

            int ind = rnd.nextInt(inputList.size());

            String word = inputList.get(ind);

            System.out.println(word);

            inputList.remove(ind);
        }
    }
}
