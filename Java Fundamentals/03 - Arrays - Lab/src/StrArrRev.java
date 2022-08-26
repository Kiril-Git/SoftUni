import java.util.Arrays;
import java.util.Scanner;

public class StrArrRev {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // write your code here

        String[] input = scanner.nextLine().split(" ");

//        String[] strArray = new String[input.length];

        for (int i = 0; i < input.length/2; i++) {

            String temp = input[i];

            input[i] = input[input.length-1-i];
            input[input.length-1-i] = temp;
        }
        System.out.println(String.join(" ", input));
    }
}