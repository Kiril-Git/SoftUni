import java.util.Scanner;

public class repeatStr3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

            for (int i = 0; i < input.length ; i++) {

                for (int j = 0; j < input[i].length(); j++) {

                    System.out.print(input[i]);
                }
            }
    }
}
