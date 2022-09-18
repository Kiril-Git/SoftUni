import java.util.ArrayDeque;
import java.util.Scanner;

public class matchingBrackets {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < input.length(); i++) {

            char temp = input.charAt(i);

            if (temp == '('){
                stack.push(i);
            }
            else if (temp == ')'){
                int startInd = stack.pop();
                int endInd = i;

                String subExpression = input.substring(startInd, endInd+1);

                System.out.println(subExpression);
            }
        }
    }
}
