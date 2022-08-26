import java.util.Scanner;

public class reverseStr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();


        while (!input.equals("end")){
            String reversed = "";

            for (int i = input.length()-1; i >= 0 ; i--) {

                reversed += input.charAt(i);
            }
            System.out.printf("%s = %s\n", input, reversed);

            reversed = "";
            input = scanner.nextLine();
        }
    }
}
