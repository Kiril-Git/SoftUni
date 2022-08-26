import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNums4 {
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
            int bombIndex = shell.indexOf(bomb);
            int startDel = bombIndex - power;
            int endDel = bombIndex + power;

            if (startDel < 0){
                startDel = 0;
            }
            if (endDel >= shell.size()){
                endDel = shell.size()-1;
            }

            if (endDel >= startDel) {
                shell.subList(startDel, endDel + 1).clear();
            }
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

