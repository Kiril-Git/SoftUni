package examPreparation;

import java.util.Scanner;

public class memoryGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder sb = new StringBuilder(scanner.nextLine());

        String input = scanner.nextLine();

        while (!input.equals("end")){

            String[] indexes = input.split(" ");

            int index1 = Integer.parseInt(indexes[0]);
            int index2 = Integer.parseInt(indexes[1]);

            char el1 = sb.charAt(index1);
            char el2 = sb.charAt(index2);

            if (el1 == el2 ){
                sb.deleteCharAt(index1);
                sb.deleteCharAt(index2);
            }
            input = scanner.nextLine();
        }
        System.out.println();
    }
}
