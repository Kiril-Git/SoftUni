package lab;
//      Methods help to split large programs into smaller bits
//      improves code understanding
//      avoiding code-repetitions
//      void methods do not return any value

import java.util.Scanner;

public class testPrintStart2EndNums {

    public static void main(String[] args) {

        System.out.println("Please enter start and end numbers on the following two lines below: ⬇️");

        Scanner scanner = new Scanner(System.in);

        int fromN = Integer.parseInt(scanner.nextLine());
        int toN = Integer.parseInt(scanner.nextLine());

        printNums(fromN, toN);


    }
    private static void printNums(int start, int end) {

        for (int i = start ; i <= end; i++) {

            System.out.printf("%d ", i);
        }
    }
}



