import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class NegNumsRemover {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numsList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        Collections.reverse(numsList);

        for (int i = 0; i < numsList.size(); i++) {

            int temp = numsList.get(i);

            if (temp < 0){
                numsList.remove(i);
            }
        }
        for (int nums : numsList) {

            if (numsList.isEmpty()){
                System.out.println("empty");
            }
            else {
                System.out.print(nums + " ");
            }
        }
    }
}

