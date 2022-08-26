import java.util.Scanner;

public class validUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");

        for (int i = 0; i < input.length; i++) {

            String userName = "";

            String temp = input[i];

            if (temp.length() < 3 || temp.length() > 16){
                continue;
            }
            for (int j = 0; j < temp.length(); j++) {

                char el = temp.charAt(j);

                if (Character.isLetterOrDigit(el) || el == 45 || el == 95){
//                        temp.contains("-") || temp.contains("_")){

                    userName += el;
                }
                else {
                    break;
                }
            }
            System.out.println(userName);

        }
    }
}
