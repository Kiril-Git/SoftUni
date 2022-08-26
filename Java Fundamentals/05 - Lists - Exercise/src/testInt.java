import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class testInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //  Четем int от конзолата
        //  10 20 30                        https://youtu.be/Anu1izx-1AE

        List<Integer> nums = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());


        System.out.println(nums);
    }
}
