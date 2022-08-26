import java.text.DecimalFormat;
import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        String operation = scanner.nextLine();
        int num2 = Integer.parseInt(scanner.nextLine());

        getResult (num1, operation, num2);

        DecimalFormat df = new DecimalFormat("0.##");

        System.out.println(df.format(getResult(num1, operation, num2)));
        }
    private static double getResult(int num1, String operation, int num2) {

        double sum = 0;

        switch (operation){
            case "+":
              sum = num1 + num2;
              break;
            case "-":
                sum = num1 - num2;
                break;
            case "*":
                sum = num1 * num2;
                break;
            case "/":
                sum = num1*1.0 / num2;
                break;
        }
        return sum;
    }
}
// DRY  -  Do not repeat yourself!!!        nBdNvxZ4
// WET  -  We enjoy typing!!!

// Всеки код е като книга, където:
// Методите са глаголите,
// а променливите - съществителните.