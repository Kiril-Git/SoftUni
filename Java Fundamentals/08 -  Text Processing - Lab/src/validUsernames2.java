import java.util.Scanner;

public class validUsernames2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");

        for (int i = 0; i < input.length; i++) {

            StringBuilder sb = new StringBuilder();

            String temp = input[i];

            if (temp.length() < 3 || temp.length() > 16){
                continue;
            }
            for (int j = 0; j < temp.length(); j++) {

                char el = temp.charAt(j);

                if (Character.isLetterOrDigit(el) || el == 45 || el == 95 ) {

                    sb.append(el);
                }
                else {
                    break;
                }
            }
            System.out.println(sb);
            sb.setLength(0);
        }
    }
}
