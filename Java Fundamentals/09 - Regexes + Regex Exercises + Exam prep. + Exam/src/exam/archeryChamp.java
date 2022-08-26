package exam;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class archeryChamp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> line = Arrays.stream(scanner.nextLine()
                .split("\\|")).collect(Collectors.toList());

        String input = scanner.nextLine();

        int points = 0;

        while (!input.equals("Game over")){
            String[] commandLn = input.split("@");

            String command = commandLn[0];

            switch (command){

                case "Shoot Right":

                    int temp = 0;
                    int temp2 = 0;
                    int index = Integer.parseInt(commandLn[1]);
                    int value = Integer.parseInt(commandLn[2]);

                    if (index >= line.size()){
                        continue;
                    }
                    else if (index + value <= line.size() ){
                        temp = index + value;
                    }
                    else{
                        int pts = 5;

                        temp =  line.size() - index;
                        temp2 = value - temp;

                        int target = Integer.parseInt(line.get(temp));
                        if (target < 5){
                            pts = 5 - target;
                        }
                        line.remove(temp2);
                        target -= pts;
                        line.add(temp2, String.valueOf(target));
                        points += pts;
                    }
                    break;
                case "Shoot Left":

                    int temp1 = 0;
                    int index1 = Integer.parseInt(commandLn[1]);
                    int value1 = Integer.parseInt(commandLn[2]);

                    int diff = Math.abs(index1 - value1);

                    if (index1 >= line.size()){
                        continue;
                    }
                    else if (index1 - value1 >= 0){
                        temp = index1 - value1;
                    }
                    else{
                        int pts = 5;

                        temp = line.size() - (value1 - index1);
                        int target = Integer.parseInt(line.get(temp));
                        if (target < 5){
                            pts = 5 - target;
                        }
                        line.remove(temp);
                        target -= pts;
                        line.add(temp, String.valueOf(target));
                        points += pts;
                    }
                    break;
                case "Reverse":
                    StringBuilder sb = new StringBuilder();
                    sb.append(line);
                    sb.reverse();
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + command);
            }
            input = scanner.nextLine();
        }
        System.out.println(String.join(" - ", line));
        System.out.printf("John finished the archery tournament with %d points!", points);
    }
}
