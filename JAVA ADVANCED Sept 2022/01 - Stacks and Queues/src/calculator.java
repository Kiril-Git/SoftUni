import java.util.ArrayDeque;
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < input.length; i ++) {

            int temp = 0;

            if (input[i].equals("+")){
                temp = stack.pop();
                temp += Integer.parseInt(input[i+1]);
                stack.push(temp);

                i++;
            }
            else if (input[i].equals("-")){
                temp = stack.pop();
                temp -= Integer.parseInt(input[i+1]);
                stack.push(temp);

                i++;
            }
            else {
                temp = Integer.parseInt(input[i]);
                stack.push(temp);
            }

        }
        System.out.println(stack.peek());
    }
}
