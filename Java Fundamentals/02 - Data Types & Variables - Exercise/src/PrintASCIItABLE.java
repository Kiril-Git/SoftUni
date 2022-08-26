import java.util.Scanner;

public class PrintASCIItABLE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int from = Integer.parseInt(scanner.nextLine());
        int to = Integer.parseInt(scanner.nextLine());

        for (int i = from; i <= to ; i++) {

            System.out.print((char) i + " ");

        }
    }
}
