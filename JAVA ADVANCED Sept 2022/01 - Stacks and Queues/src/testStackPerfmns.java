import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class testStackPerfmns {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        Arrays.stream(input.split(" "))
                .mapToInt(Integer::parseInt)
                .forEach(n -> stack.push(n));

        for (Integer integer : stack){
            System.out.println(integer);
        }
    }
}
