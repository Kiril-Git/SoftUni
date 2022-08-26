import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();

        String pass = "";
        int attempts = 0;

        for (int i = username.length() - 1; i >=0; i--){
            pass += username.charAt(i);
        }
        while (true){
            String input = scanner.nextLine();

            attempts ++;

            if (input.equals(pass)) {
                System.out.printf("User %s logged in.", username);

                break;
            }
            else if (attempts == 4){
                    System.out.printf("User %s blocked!", username);
                    break;
                }
            System.out.println("Incorrect password. Try again.");
        }
    }
}
