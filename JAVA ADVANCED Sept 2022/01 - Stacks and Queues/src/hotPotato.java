import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class hotPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] circle = scanner.nextLine().split(" ");
        int n = Integer.parseInt(scanner.nextLine());

        ArrayDeque<String> queue = new ArrayDeque<>();

        Collections.addAll(queue, circle);


        while (queue.size() > 1){

            for (int i = 1; i < n; i++) {

                String kid = queue.remove();

                queue.offer(kid);
            }
            String name = queue.poll();
            System.out.println("Removed " + name);
        }
        System.out.println("Last is " + queue.peek());
    }
}
