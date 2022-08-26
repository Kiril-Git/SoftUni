import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> wagons = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int capacity = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();

        while (!input.equals("end")) {

            String[] commandLn = input.split("\\s+");

//            int element = 0;
//            int index = 0;

            if (commandLn[0].equals("Add")) {

                wagons.add(Integer.parseInt(commandLn[1]));
            }
            else {
                for (int i = 0; i < wagons.size(); i++) {

                    int temp = Integer.parseInt(input);
                    if (wagons.get(i) + temp <= capacity){
                        wagons.set(i, wagons.get(i) + temp);
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

