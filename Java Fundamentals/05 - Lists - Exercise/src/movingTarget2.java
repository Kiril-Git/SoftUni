import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class movingTarget2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> targets = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int temp = 0;
        int sum = 0;
        String input = scanner.nextLine();

        while (!input.equals("End")) {

            List<String> commandLn = Arrays.stream(input.split(" ")).toList();

            String command = commandLn.get(0);
            int index = Integer.parseInt(commandLn.get(1));
            int value = Integer.parseInt(commandLn.get(2));

            switch (command){
                case "Shoot":
                    if (targets.size() > index ){
                        temp = targets.get(index);
                        targets.remove(index);
                        sum = temp - value;
                        if (sum > 0) {
                            targets.add(index, sum);
                        }
                    }
                    break;
                case "Add":
                    if (targets.size() > index ){
                        targets.add(index, value);
                    }
                    else{
                        System.out.println("Invalid placement!");
                    }
                    break;
                case "Strike":
                    int startDel = index - value;
                    int endDel = index + value;

                    if (startDel < 0 || endDel > targets.size()-1){
                        System.out.println("Strike missed!");
                    }
                    else  {
                        targets.subList(startDel, endDel+1).clear();
                    }
                    break;

            }
            input = scanner.nextLine();
        }
        targets.forEach(el -> System.out.print(el + "|"));
//        System.out.println(targets.toString().replaceAll("[\\[\\],]",  ""));
    }
}