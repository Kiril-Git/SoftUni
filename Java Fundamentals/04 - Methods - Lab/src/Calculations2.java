import java.util.Scanner;

public class Calculations2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String operation = scanner.nextLine();
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        switch (operation) {
            case "add" : adding(num1, num2);   break;                // num - Arguments
            case "subtract" : subtracting(num1, num2);  break;
            case "multiply" : multiplying(num1, num2);  break;
            case "divide" : dividing(num1, num2);   break;
        }
        }
    private static void dividing(int num1, int num2) {          // num - parameters
        System.out.println(num1 / num2);
    }
    private static void multiplying(int num1, int num2) {
        System.out.println(num1 * num2);
    }
    private static void subtracting(int num1, int num2) {
        System.out.println(num1 - num2);
    }
    private static void adding(int num1, int num2){
        System.out.println(num1 + num2);
    }
}
// DRY  -  Do not repeat yourself!!!
// WET  -  We enjoy typing!!!

// Всеки код е като книга, където:
// Методите са глаголите,
// а променливите - съществителните.