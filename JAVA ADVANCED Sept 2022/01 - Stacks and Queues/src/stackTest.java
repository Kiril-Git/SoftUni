import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Scanner;

public class stackTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        stack.push(13);
        stack.push(42);
        stack.push(69);

        int topEl = stack.pop();                    //  removes the last added el   (69)
        System.out.println(topEl + " - pop");

        int peekedEl = stack.peek();
        System.out.println(peekedEl+ " - peek");   //  displays the last el (42 since 69 was popped out above)

        System.out.println(stack.size()+ " - stack size");
        System.out.println(stack.isEmpty()+ " - check if stack is empty");

        System.out.println("Print stack elements ⬇️");
        for (Integer el : stack){
            System.out.print(el + " ");
        }
    }
}
