//  case "3":
//     System.out.println(Collections.max(stack));
//        break;

//   int smallest = stack.stream().mapToInt(el -> el).min().getAsInt();
//        System.out.println(smallest);

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class maxElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        FIFO  -   First in First out          stack principle

        int n = Integer.parseInt(scanner.nextLine());

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            String[] line = scanner.nextLine().split(" ");

            String command = line[0];

            switch (command){
                case "1":
                    int num = Integer.parseInt(line[1]);
                    stack.push(num);
                    break;

                case "2":
                    stack.pop();
                    break;

                case "3":
//                    int largestOne = stack.stream().mapToInt(el -> el).max().getAsInt();
                    System.out.println(Collections.max(stack));
                    break;
            }
        }
    }
}
