import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

//  + String format printing Method

public class SumEqualNums2 {
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
        System.out.print(joinElsbyDelim(numsList, " "));
    }
    public static String joinElsbyDelim(List<Double> list, String delimiter){
        String result = "";

        for (Double nums : list) {
            DecimalFormat df = new DecimalFormat("0.#");

            String numFormat = df.format(nums) + delimiter;

            result += numFormat;
        }
        return result;
    }
}

  

