import java.util.Scanner;

public class Login2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();

        String pass = "";
        int attempts = 0;

        for (int i = username.length() - 1; i >= 0; i--) {
            pass += username.charAt(i);
        }
        String input = scanner.nextLine();

        while (!input.equals(pass)) {
            attempts++;
            if (attempts == 4) {
                System.out.printf("User %s blocked!", username);
                return;
            }
            System.out.println("Incorrect password. Try again.");
            input = scanner.nextLine();
        }
        //  if (input.equals(pass)){
        System.out.printf("User %s logged in.", username);

        //  }
    }
}


