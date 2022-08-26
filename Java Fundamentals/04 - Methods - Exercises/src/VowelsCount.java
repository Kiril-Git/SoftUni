import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine().toLowerCase();

        printVowelsN(text);
    }
    private static void printVowelsN(String text) {

        int count = 0;

        for (char symbol : text.toCharArray()) {

            if (symbol == 'a' || symbol == 'e' || symbol == 'i' || symbol == 'o' || symbol == 'u' ){
                count++;
            }
        }
        System.out.println(count);
    }
}
