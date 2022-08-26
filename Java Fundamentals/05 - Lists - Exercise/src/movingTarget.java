import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class movingTarget {
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

            String[] commandLn = input.split(" ");

            String command = commandLn[0];
            int index = Integer.parseInt(commandLn[1]);
            int value = Integer.parseInt(commandLn[2]);

            switch (command){
                case "Shoot":
                    if (targets.size() > index & index >= 0){
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
                    int startDel = index - value;                           //  for (int i = 0; i < rad; i++){
                    int endDel = index + value;                             //  targets.remove(index - value)
                                                                            //  }
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
        List<String> print = new ArrayList<>();
        for (int target : targets) {
            print.add(String.valueOf(target));
        }
        System.out.println(String.join("|", print));
//        System.out.println(targets.toString().replaceAll("[\\[\\],]",  ""));
    }
}
//                         https://youtu.be/Anu1izx-1AE

