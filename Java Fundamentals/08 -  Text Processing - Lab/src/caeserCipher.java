import java.util.Scanner;

public class caeserCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] input = scanner.nextLine().toCharArray();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < input.length; i++) {

//            char temp = (char)(input[i] + 3);
//            sb.append(temp);

            sb.append(String.format("%c", input[i] + 3));
        }
        System.out.println(sb);
    }
}
