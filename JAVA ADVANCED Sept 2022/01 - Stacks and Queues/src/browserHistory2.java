import java.util.ArrayDeque;
import java.util.Scanner;

public class browserHistory2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        ArrayDeque<String> stack = new ArrayDeque<>();
        ArrayDeque<String> stack2 = new ArrayDeque<>();

        while (!input.equals("Home")){

            if (input.equals("back") & stack.size() < 2){
                System.out.println("no previous URLs");
            }
            else if (input.equals("back")){

                String temp = stack.pop();
                stack2.addFirst(temp);
                System.out.println(stack.peek());
            }
            else if (input.equals("forward")){

                if (stack2.isEmpty()){
                    System.out.println("no next URLs");
                }
                else {
                    String temp = stack2.pop();
                    stack.push(temp);

                    System.out.println(temp);
                }
            }
            else {
                stack.push(input);
                System.out.println(input);
            }
            input = scanner.nextLine();
        }
    }
}
