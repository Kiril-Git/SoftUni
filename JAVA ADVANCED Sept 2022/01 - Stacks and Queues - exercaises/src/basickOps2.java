//   int smallest = stack.stream().mapToInt(el -> el).min().getAsInt();
//        System.out.println(smallest);

import java.util.ArrayDeque;
import java.util.Scanner;

public class basickOps2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        FIFO  -   First in First out          stack principle

        String[] commands = scanner.nextLine().split(" ");
        String input = scanner.nextLine();

        int n = Integer.parseInt(commands[0]);
        int s = Integer.parseInt(commands[1]);
        int x = Integer.parseInt(commands[2]);

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {

            String[] line = input.split("\\s+");
            stack.push(Integer.parseInt(line[i]));
        }
        for (int i = 0; i < s; i++) {
            stack.pop();
        }
        if (stack.isEmpty()) {
            System.out.println(0);
        }
           else if (stack.contains(x)) {
            System.out.println("true");
        }
        else {
            int smallest = stack.stream().mapToInt(el -> el).min().getAsInt();
            System.out.println(smallest);
        }
    }
}
