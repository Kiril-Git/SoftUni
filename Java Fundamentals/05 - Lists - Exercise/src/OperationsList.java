import java.util.*;
import java.util.stream.Collectors;

public class OperationsList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> nums = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("End")) {

            List<String> commandLn = Arrays.stream(input.split(" "))
                    .collect(Collectors.toList());

            String command = commandLn.get(0);

            if (command.equals("Remove")) {
                int element = Integer.parseInt(commandLn.get(1));
                int index = Integer.parseInt(commandLn.get(1));

                if (index >= nums.size() || index < 0){
                    System.out.println("Invalid index");
                }
                else {
                    nums.remove(element);
                }
            }
            else if (command.equals("Add")) {
                int element = Integer.parseInt(commandLn.get(1));

                nums.add(element);
            }
            else if (command.equals("Insert")) {
                int element = Integer.parseInt(commandLn.get(1));
                int index = Integer.parseInt(commandLn.get(2));

                if (index >= nums.size() || index < 0){
                    System.out.println("Invalid index");
                }
                else {
                    nums.add(index, element);
                }
            }
            else if (command.equals("Shift")){

                for (int i = 0; i < Integer.parseInt(commandLn.get(2)); i++) {

                    if (commandLn.get(1).equals("left")){

                        int temp = nums.get(0);
                        nums.remove(0);
                        nums.add(temp);
                    }
                    else if (commandLn.get(1).equals("right")){

                        int temp = nums.get(nums.size()-1);
                        nums.remove(nums.size()-1);
                        nums.add(0, temp);
                    }
                }
            }
            input = scanner.nextLine();
        }
//        System.out.println(wagons.toString().replaceAll("[\\[\\],]",  ""));
        nums.forEach(el -> System.out.print(el + " "));
    }
}
//                         https://youtu.be/Anu1izx-1AE

