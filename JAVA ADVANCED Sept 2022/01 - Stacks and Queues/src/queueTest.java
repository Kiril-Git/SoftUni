import java.util.ArrayDeque;
import java.util.Scanner;

public class queueTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        stack.push(13);     //      Adding an element to the top of the stack
        stack.peek();          //      return teh top el without removing it
        stack.pop();           //      returns the top el and removes it

        ArrayDeque<Integer> queue = new ArrayDeque<>();

        queue.offer(13);     //      Adding an element to the end of the queue
        queue.peek();           //      return teh front el without removing it
        queue.poll();           //      returns the front el and removes it

        queue.offer(13);
        queue.offer(42);
        queue.offer(69);

        System.out.println(queue.poll());
        System.out.println(queue.peek());

    }
}
