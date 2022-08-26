import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> shell = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = scanner.nextLine();

        List<String> bombPower = Arrays.stream(input.split(" "))
                .collect(Collectors.toList());
        int bomb = Integer.parseInt(bombPower.get(0));
        int power = Integer.parseInt(bombPower.get(1));
        int sum = 0;

        while (shell.contains(bomb)){

            for (int i = 0; i < shell.size(); i++) {

                int el = shell.get(i);
                int index = 0;

                if (el == bomb){

                    index = i;
                    int num = power * 2;
                    int del = index - power;
                    if (del < 0){
                        del = 0;
                    }
                    if (del + num > shell.size()){
                        num = shell.size()-2;
                    }
                    for (int j = 0; j < num; j++) {
                        shell.remove(del);
                    }
                }
            }
            input = scanner.nextLine();
        }
        for (int i = 0; i < shell.size(); i++) {

            int el = shell.get(i);
            sum += el;
        }
        System.out.println(sum);
//        System.out.println(wagons.toString().replaceAll("[\\[\\],]",  ""));
//        shell.forEach(el -> System.out.print(el + " "));
    }
}
//                         https://youtu.be/Anu1izx-1AE

