package hero;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        DarkKnight darkKnight = new DarkKnight("Kozhata", 16);

        System.out.println(darkKnight);
    }
}
