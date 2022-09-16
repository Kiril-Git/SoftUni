import java.util.Scanner;

public class powTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int base = Integer.parseInt(scanner.nextLine());
        int exponent = Integer.parseInt(scanner.nextLine());

        int result = base;

        for (int i = 1; i < exponent; i++) {

            result *= base;
        }
        if (exponent == 0){
            result = 1;
        }
        System.out.println(result);
    }
}
