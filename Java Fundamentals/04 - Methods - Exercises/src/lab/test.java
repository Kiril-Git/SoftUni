package lab;
//      Methods help to split large programs into smaller bits
//      improves code understanding
//      avoiding code-repetitions
//      void methods do not return any value

import java.util.Scanner;

public class test {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        printLoveYou();
        printHello();

        String text = scanner.nextLine();
        printText(text);

    }

    private static void printText(String text) {
        for (int i = 0; i < 6; i++) {
            System.out.println(text);
        }
    }

    private static void printLoveYou() {
        System.out.println("I love you baby");
    }

    public static void printHello(){

        for (int i = 0; i < 6; i++) {

            System.out.print("Hello! ");
        }
        System.out.println();
    }
}



