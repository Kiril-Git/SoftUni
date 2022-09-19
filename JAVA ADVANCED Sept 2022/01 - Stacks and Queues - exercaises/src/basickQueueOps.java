//   int smallest = stack.stream().mapToInt(el -> el).min().getAsInt();
//        System.out.println(smallest);

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class basickQueueOps {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        FIFO  -   First in First out          queue principle

        String[] commands = scanner.nextLine().split(" ");
        String input = scanner.nextLine();

        int n = Integer.parseInt(commands[0]);
        int s = Integer.parseInt(commands[1]);
        int x = Integer.parseInt(commands[2]);

        ArrayDeque<Integer> queue = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {

            String[] line = input.split("\\s+");
            queue.offer(Integer.parseInt(line[i]));
        }
        for (int i = 0; i < s; i++) {
            queue.poll();
        }
        if (queue.isEmpty()) {
            System.out.println(0);
        }
           else if (queue.contains(x)) {
            System.out.println("true");
        }
        else {
            System.out.println(Collections.min(queue));

//            int smallest = queue.stream().mapToInt(el -> el).min().getAsInt();
//            System.out.println(smallest);
        }
    }
}
