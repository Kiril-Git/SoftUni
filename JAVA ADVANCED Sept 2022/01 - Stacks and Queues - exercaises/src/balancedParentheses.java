import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.function.Predicate;

public class balancedParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        ArrayDeque<String> queue = new ArrayDeque<>();
        ArrayDeque<String> stack = new ArrayDeque<>();


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
        String subStr = input.substring(input.length()/2);

        if (input.length() % 2 != 0){
            System.out.println("NO");
        }
        else if (stack.toString().equals(queue.toString())){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
