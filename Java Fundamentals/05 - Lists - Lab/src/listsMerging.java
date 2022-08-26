import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class listsMerging {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numsList1 = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> numsList2 = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> numsList = new ArrayList<>();
        int minSize = Math.min(numsList1.size(), numsList2.size());

        for (int i = 0; i < minSize; i++) {

            int el1 = numsList1.get(i);
            int el2 = numsList2.get(i);

            numsList.add(el1);
            numsList.add(el2);
        }
        if (numsList1.size() > numsList2.size()){
            numsList.addAll(numsList1.subList(minSize, numsList1.size()));
        }
        else {
            numsList.addAll(numsList2.subList(minSize, numsList2.size()));
        }
        for (int nums : numsList) {
            System.out.print(nums + " ");
        }
    }
}

  

