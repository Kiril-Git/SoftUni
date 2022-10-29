package cardSuit;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Card Suits:");

        for (CardSuit el : CardSuit.values()){
            System.out.printf("Ordinal value: %d; Name value: %s\n", el.ordinal(), el);
        }

    }
}
