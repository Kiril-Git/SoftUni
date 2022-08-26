import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num = scanner.nextDouble();
        double pow = scanner.nextInt();

        getSum(num, pow);                           // num - Arguments

        double sum = getSum(num, pow);

        DecimalFormat df = new DecimalFormat("0.####");
        System.out.printf(df.format(sum));
    }

    private static double getSum(double num, double pow) {

        return Math.pow(num, pow);
    }
}
    /*When methods with equal name have got different parameters,
    this is called method "overloading"
    Example:
    public static void print(String text) { System.out.println(text); }
    public static void print(int num) { System.out.println(num); }
    */
// return - с return  се прекратява изпълнението на метода, дори това да е main method-a.

// DRY  -  Do not repeat yourself!!!
// WET  -  We enjoy typing!!!

// Всеки код е като книга, където:
// Методите са глаголите,
// а променливите - съществителните.


