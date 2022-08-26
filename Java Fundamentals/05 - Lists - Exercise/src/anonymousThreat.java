import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class anonymousThreat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> shell = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());

        List<String> output = new ArrayList<>();
        List<String> temp = new ArrayList<>();

        String input = scanner.nextLine();

        while (!input.equals("3:1")){

            String[] commandLn = input.split(" ");

            String command = commandLn[0];
            int index = Integer.parseInt(commandLn[1]);
            int value = Integer.parseInt(commandLn[2]);

            switch (command){
                case "merge":
                    if (value >= shell.size()){
                        value = shell.size()-1;
                    }
                    if (index >= value){
                        break;
                    }
                        output = shell.subList(0, index);
                        temp = shell.subList(index, value+1);
                        String merged = "";

                        for (String mEl : temp){
                            merged += mEl;
                        }
                    shell.subList(index, value+1).clear();
                        shell.add(index, merged);
                    break;
                case "divide":

                    temp = new ArrayList<>();

                    String element = shell.get(index);
                    String el = "";
                    int n = element.length() / value;

                    if (element.length() % value == 0){

                        for (int i = 0; i < value; i++) {

                            temp.add(element.substring(0, n));



                        }
                    }



                    break;





            }
            input = scanner.nextLine();
        }


        shell.forEach(el -> System.out.print(el + " "));//        System.out.println(wagons.toString().replaceAll("[\\[\\],]",  ""));
//        shell.forEach(el -> System.out.print(el + " "));
    }
}
//                         https://youtu.be/Anu1izx-1AE

