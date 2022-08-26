import java.util.Scanner;

public class Lower0rUpper2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char letter = scanner.nextLine().charAt(0);

        if (Character.isLowerCase(letter)){

            System.out.println("lower-case");
        }
        else if (Character.isUpperCase(letter)){

            System.out.println("upper-case");
        }
    }
}
