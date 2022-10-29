package cardRank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Card Ranks:");

        for (CardRank el : CardRank.values()){
            System.out.printf("Ordinal value: %d; Name value: %s\n", el.ordinal(), el);
        }
    }
}
