import java.util.ArrayDeque;
import java.util.Scanner;

public class balancedParentheses3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        ArrayDeque<String> queue = new ArrayDeque<>();
        ArrayDeque<String> stack = new ArrayDeque<>();

        int count = 0;

        for (int i = 0; i < input.length(); i++) {

            String[] line = input.split("");

            String temp = line[i];

            if (i < input.length()/2) {

                if(temp.equals("(")){
                    stack.push(")");
                }
                if(temp.equals("[")){
                    stack.push("]");
                }
                if(temp.equals("{")){
                    stack.push("}");
                }
            }
            else {
                queue.offer(temp);
//                queue.addFirst(temp);
            }
        }
        for (int i = 0; i < stack.size(); i++) {

            if (!stack.pop().equals(queue.poll())){
                count++;
            }

        }
        if (count != 0){
            System.out.println("NO");
        }
        else {
            System.out.println("YES");
        }
    }
}
