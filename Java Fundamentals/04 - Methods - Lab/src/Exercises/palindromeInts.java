package Exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class palindromeInts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("END")) {

            int num = Integer.parseInt(input);

            List revNums = new ArrayList<>();
            String revN = "";

            for (int i = 0; i < input.length(); i++) {

                char temp = input.charAt(i);
                revNums.add(0, (char) temp);



            }

            String rev = revNums.toString();
            int revNum = Integer.parseInt(rev.toString());
            System.out.println(revNum);
            System.out.println(num);
//            int revo = Integer.parseInt(rev);
            if (rev.equals(input)) {
                System.out.println("true");
            }
            else System.out.println("false");

            input = scanner.nextLine();
        }

    }
}
