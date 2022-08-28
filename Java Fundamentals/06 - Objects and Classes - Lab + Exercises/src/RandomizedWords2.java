import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RandomizedWords2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> inputList = Arrays.stream(scanner.nextLine().split(" "))
                .collect(Collectors.toList());

        int size = inputList.size()-1;

        for (int i = 0; i < size; i++) {

            Random rnd = new Random();

            int ind = rnd.nextInt(inputList.size());

            String word = inputList.get(i);

            System.out.println(word);

            inputList.remove(i);
            size++;
        }

    }
}
