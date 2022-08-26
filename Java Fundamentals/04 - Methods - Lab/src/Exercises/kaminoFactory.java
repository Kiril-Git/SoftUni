package Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class kaminoFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         int n = Integer.parseInt(scanner.nextLine());

         int[] dna = new int[n];

         int max = 0;
         int index = 0;
         int smallerInd = 0;
         int sample = 0;
         int maxSample = 0;


         String input = scanner.nextLine();

         while (!input.equals("Clone them!")) {

             sample++;

             String[] line = input.split("!+");

             dna = Arrays.stream(line).mapToInt(Integer::parseInt).toArray();

             for (int i = 0; i < dna.length; i++) {

                 int num1 = dna[i];

                 if (num1 > max) {
                     max = num1;
                     index = i;
                 }
             }
             input = scanner.nextLine();
         }
        System.out.println("sample: " + sample);
        System.out.println("max: " + max);
    }
}
