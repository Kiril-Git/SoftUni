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
        String command = scanner.nextLine();

        long sumStars = 0;
        while (!command.equals("Let the Force be with you")) {

            Jedi jedi = new Jedi(Arrays.stream(command.split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray());
            int[] positionEvil = readPositions(scanner);
            int rowEvil = positionEvil[0];
            int calEvil = positionEvil[1];

            Galaxy galaxy = new Galaxy(field, jedi);
            galaxy.evilMove(rowEvil, calEvil);

            sumStars += galaxy.jediMove();
            command = scanner.nextLine();
        }
        System.out.println(sumStars);

    }

    private static int[] readPositions(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
