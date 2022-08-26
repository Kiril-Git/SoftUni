import java.util.Scanner;

public class VowelsCount2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine().toLowerCase();

        System.out.println(getVowelsN(text));
    }
    private static int getVowelsN(String text) {

        int count = 0;

        for (char symbol : text.toCharArray()) {

            if (symbol == 'a' || symbol == 'e' || symbol == 'i' || symbol == 'o' || symbol == 'u' ){
                count++;
            }
        }
        return count;
    }
}
