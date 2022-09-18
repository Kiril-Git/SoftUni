import java.util.ArrayDeque;
import java.util.Scanner;

public class printerQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        ArrayDeque<String> queue = new ArrayDeque<>();

        while (!input.equals("print")){

            if (input.equals("cancel") & queue.isEmpty()){
                System.out.println("Printer is on standby");
            }
            else if (input.equals("cancel")){
                String temp = queue.poll();
                System.out.println("Canceled " + temp);
            }
            else {
                queue.offer(input);
            }
            input = scanner.nextLine();
        }
        for (String el : queue){
            System.out.println(el);
        }

//        while (!queue.isEmpty()){
//            System.out.println(queue.poll());
//        }

    }
}
