import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class listsManipulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numsList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("end")) {

            List<String> commandLn = Arrays.stream(input.split(" "))
                    .collect(Collectors.toList());

            String command = commandLn.get(0);
            int element = 0;
            int index = 0;

            switch (command){
                case "Add":
                    element = Integer.parseInt(commandLn.get(1));
                    numsList.add(element);
                    break;
                case "Remove":
                    element = Integer.parseInt(commandLn.get(1));
                    numsList.remove(Integer.valueOf(element));
                    break;
                case "RemoveAt":
                    index = Integer.parseInt(commandLn.get(1));
                    numsList.remove(index);
                    break;
                case "Insert":
                    index = Integer.parseInt(commandLn.get(2));
                    element = Integer.parseInt(commandLn.get(1));
                    numsList.add(index, element);
                    break;
            }
            input = scanner.nextLine();
        }
        for (int nums : numsList) {
            System.out.print(nums + " ");
        }
    }
}

