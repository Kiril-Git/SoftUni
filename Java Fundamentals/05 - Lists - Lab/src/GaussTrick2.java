import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GaussTrick2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numsList = Arrays.stream(scanner.nextLine().split(" "))
                        .map(Integer::parseInt)
                                .collect(Collectors.toList());

        int sizeList = numsList.size();

        for (int i = 0; i < sizeList/2; i++) {

            int el1 = numsList.get(i);
            int el2 = numsList.get(numsList.size()-1);

                numsList.set(i, el1 + el2);
                numsList.remove( numsList.size() - 1);
            }
        System.out.println(numsList.toString().replaceAll("[\\[\\],]",  ""));
    }
}

  

