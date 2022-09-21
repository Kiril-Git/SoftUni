import java.util.ArrayDeque;
import java.util.Scanner;

public class balancedParentheses2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        ArrayDeque<String> queue = new ArrayDeque<>();
        ArrayDeque<String> stack = new ArrayDeque<>();

        boolean not = false;

        for (int i = 0; i < input.length(); i++) {

            char temp = input.charAt(i);

            if (i < input.length()/2) {

                if(temp == '('){
                    stack.push(")");
                }
                if(temp == '['){
                    stack.push("]");
                }
                if(temp == '{'){
                    stack.push("}");
                }
            }
            else {
                queue.offer(String.valueOf(temp));
            }
        }
        for (int i = 0; i < stack.size(); i++) {

            String temp1 = queue.poll();
            String temp2 = stack.pop();

            if (!temp1.equals(temp2)){
                not = true;
                break;
            }
        }
        if (not){
            System.out.println("NO");
        }
        else {
            System.out.println("YES");
        }

    }
}
