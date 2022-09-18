import java.util.ArrayDeque;
import java.util.Scanner;

public class revNums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        FIFO  -   First in First out          stack principle

        String[] input = scanner.nextLine().split(" ");

        ArrayDeque<String> stack = new ArrayDeque<>();

        for (int i = 0; i < input.length; i++) {

            String temp = input[i];

            stack.push(temp);

        }
        for (String el : stack) {
            System.out.print(el + " ");
        }
    }
}
