import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class mathPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] circle = scanner.nextLine().split(" ");
        int n = Integer.parseInt(scanner.nextLine());

        ArrayDeque<String> queue = new ArrayDeque<>();

        Collections.addAll(queue, circle);

        int cycles = 1;

        while (queue.size() > 1){

            for (int i = 1; i < n; i++) {
                String kid = queue.remove();
                queue.offer(kid);
            }

            String kid = queue.peek();

            if (!isPrime(cycles)) {

                    System.out.println("Removed " + kid);
                    queue.remove();
                }
                else {
                    System.out.println("Prime " + kid);
                }
            cycles++;
        }
        System.out.println("Last is " + queue.peek());
    }

    private static boolean isPrime(int cycles) {
        if ( cycles == 1){
            return false;
        }
        for (int i = 2; i < cycles; i++) {
            if (cycles % i == 0 & i != 1 & i != cycles){
                return false;
            }
        }
        return true;
    }
}
