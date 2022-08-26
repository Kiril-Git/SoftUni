import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SumEqualNums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> numsList = Arrays.stream(scanner.nextLine().split(" "))
                        .map(Double::parseDouble)
                                .collect(Collectors.toList());

        for (int i = 0; i < numsList.size()-1; i++) {

            double el1 = numsList.get(i);
            double el2 = numsList.get(i+1);

            if (el1 == el2){
                numsList.set(i, el1 + el2);
                numsList.remove(i+1);
                i = -1;
            }
        }
        for (Double nums : numsList) {
            DecimalFormat df = new DecimalFormat("0.##");

            System.out.print(df.format(nums) + " ");
        }
    }
}

  

