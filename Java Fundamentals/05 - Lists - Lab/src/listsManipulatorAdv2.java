import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class listsManipulatorAdv2 {
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
                case "Contains":
                    element = Integer.parseInt(commandLn.get(1));
                    if (numsList.contains(element)){
                        System.out.println("Yes");
                    }
                    else
                        {
                            System.out.println("No such number");
                        }
                    break;
                case "Print":
                    if (commandLn.get(1).equals("even")){
                        for (int i = 0; i < numsList.size(); i++) {
                            int el = numsList.get(i);
                            if (el % 2 == 0){
                                System.out.print(el + " ");
                            }
                        }
                        System.out.println();
                    }
                    else if (commandLn.get(1).equals("odd")){
                        for (int i = 0; i < numsList.size(); i++) {
                            int el = numsList.get(i);
                            if (el % 2 != 0){
                                System.out.print(el + " ");
                            }
                        }
                        System.out.println();
                    }
//                    element = Integer.parseInt(commandLn.get(1));
//                    numsList.remove(Integer.valueOf(element));
                    break;
                case "Get":
                    if (commandLn.get(1).equals("sum")){
                        int sum = 0;
                        for (int i = 0; i < numsList.size(); i++) {
                            int el = numsList.get(i);
                            sum += el;
                        }
                        System.out.println(sum);
                    }
//                    index = Integer.parseInt(commandLn.get(1));
//                    numsList.remove(index);
                    break;
                case "Filter":
                    if (commandLn.get(1).equals(">=")){
                        element = Integer.parseInt(commandLn.get(2));
                        for (int i = 0; i < numsList.size(); i++) {
                            int el = numsList.get(i);
                            if (el >= element){
                                System.out.print(el + " ");
                            }
                        }
                        System.out.println();
                    }
                    else if (commandLn.get(1).equals("<")){
                        element = Integer.parseInt(commandLn.get(2));
                        for (int i = 0; i < numsList.size(); i++) {
                            int el = numsList.get(i);
                            if (el < element){
                                System.out.print(el + " ");
                            }
                        }
                        System.out.println();
                    }
//                    index = Integer.parseInt(commandLn.get(2));       desislava.topuzakova@softuni.bg
//                    element = Integer.parseInt(commandLn.get(1));
//                    numsList.add(index, element);
                    break;
            }
            input = scanner.nextLine();
        }

    }

}

