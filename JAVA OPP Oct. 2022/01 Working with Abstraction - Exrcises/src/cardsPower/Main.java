package cardsPower;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Card cardRank = Card.valueOf(scanner.nextLine());
        SuitPower cardSuit = SuitPower.valueOf(scanner.nextLine());

        int cardPow = cardRank.getPower() + cardSuit.getPower();

        System.out.printf("Card name: %s of %s; Card power: %d\n", cardRank, cardSuit, cardPow);

    }
}
