import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> nums = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("end")) {

            List<String> commandLn = Arrays.stream(input.split(" "))
                    .collect(Collectors.toList());

            String command = commandLn.get(0);
            int element = Integer.parseInt(commandLn.get(1));

            if (command.equals("Delete")) {

                nums.removeAll(Collections.singleton(element));
            }
            else if (command.equals("Insert")) {
                int index = Integer.parseInt(commandLn.get(2));

                nums.add(index, element);
            }
            input = scanner.nextLine();
        }
//        System.out.println(wagons.toString().replaceAll("[\\[\\],]",  ""));
        nums.forEach(el -> System.out.print(el + " "));
    }
}
//                         https://youtu.be/Anu1izx-1AE

