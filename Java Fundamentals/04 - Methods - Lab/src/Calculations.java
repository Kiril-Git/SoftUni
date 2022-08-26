import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String operation = scanner.nextLine();
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        if (operation.equals("add")){                            // num - Arguments
            adding(num1, num2);
        }
        else if (operation.equals("subtract")){
            subtracting(num1, num2);
            }
        else if (operation.equals("multiply")){
            multiplying(num1, num2);
        }
        else if (operation.equals("divide")){
            dividing(num1, num2);
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