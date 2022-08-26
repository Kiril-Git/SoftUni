package examExercises;

import java.util.Arrays;
import java.util.Scanner;

public class caminoFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[] dna = new int[n];

        String line = scanner.nextLine();

        while (!line.equals("Clone them!" )){

            dna = Arrays.stream(line.split("!+"))
                    .mapToInt(Integer::parseInt).toArray();


            line = scanner.nextLine();
        }

    }
}
