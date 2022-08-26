package examPreparation;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class memoryGame2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> line = Arrays.stream(scanner.nextLine()
                            .split(" ")).collect(Collectors.toList());

        String input = scanner.nextLine();

        int lineNum = line.size();
        int elsNum = 0;

        while (!input.equals("end")){

            String[] indexes = input.split(" ");

            int index1 = Integer.parseInt(indexes[0]);
            int index2 = Integer.parseInt(indexes[1]);

            if (index1 == index2 || index1 < 0 || index2 < 0 ||
                    index1 > line.size()-1 ||index2 > line.size()-1){

                String temp = String.valueOf(elsNum+1);
                temp += "a";

                line.add(line.size()/2, temp);
                line.add(line.size()/2+1, temp);

                System.out.println("Invalid input! Adding additional elements to the board");
            }
            else if (line.get(index1).equals(line.get(index2))) {
                String el1 = line.get(index1);
                line.remove(index1);
                line.remove(index2);
                elsNum ++;
                System.out.printf("Congrats! You have found matching elements - %s!\n", el1);
            }
            else {
                System.out.println("Try again!");
            }
            input = scanner.nextLine();
        }
        if (elsNum * 2 == line.size()) {
            System.out.printf("You have won in %d turns!\n", elsNum);
        }
        else {
            System.out.println("Sorry you lose :(");
            for (String el : line){
                System.out.print(el + " ");
            }
        }
    }
}
