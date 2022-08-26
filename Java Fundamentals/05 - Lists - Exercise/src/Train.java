import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> wagons = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int capacity = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();

        while (!input.equals("end")) {

            List<String> commandLn = Arrays.stream(input.split(" "))
                    .collect(Collectors.toList());
            String command = commandLn.get(0);

            int element = 0;
//            int index = 0;

            if (command.equals("Add")) {

                    element = Integer.parseInt(commandLn.get(1));
                    wagons.add(element);
            }
            else {
                for (int i = 0; i < wagons.size(); i++) {
                    int el = wagons.get(i);
                    int temp = Integer.parseInt(input);
                    if (temp + el <= capacity){
                        el += temp;
                        wagons.set(i, el);
                        break;
                    }
                }
            }
            input = scanner.nextLine();
        }
//        System.out.println(wagons.toString().replaceAll("[\\[\\],]",  ""));

        wagons.forEach(el -> System.out.print(el + " "));
    }
}
//                         https://youtu.be/Anu1izx-1AE

