import java.util.Scanner;

public class explosions2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       StringBuilder sb = new StringBuilder(scanner.nextLine());

       int dels = 0;

        for (int i = 0; i < sb.length(); i++) {

            if (dels > 0 & sb.charAt(i) != '>'){
                sb.deleteCharAt(i);
                dels--;
                i--;
            }
            else if (sb.charAt(i) == '>'){
               dels += Integer.parseInt(String.valueOf(sb.charAt(i+1))) - 1;

                sb.deleteCharAt(i+1);
            }
        }
        System.out.println(sb);
    }
}
