package jediGalaxy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = readPositions(scanner);
        int rows = dimensions[0];
        int cols = dimensions[1];

        Field field = new Field(rows, cols);

            Jedi jedi = new Jedi(readPositions(scanner));
            int[] positionEvil = readPositions(scanner);
            int rowEvil = positionEvil[0];
            int calEvil = positionEvil[1];

        Galaxy galaxy = new Galaxy(field, jedi);
        galaxy.evilMove(rowEvil, calEvil);

        int sumStars = galaxy.jediMove();
        System.out.println(sumStars);

    }

    private static int[] readPositions(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
