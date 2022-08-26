import java.text.DecimalFormat;
import java.util.Scanner;

public class TwoValuesSize {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();

        switch (type){
            case "int":
                int num1 = Integer.parseInt(scanner.nextLine());
                int num2 = Integer.parseInt(scanner.nextLine());
                System.out.println(getMax(num1, num2));
                break;
            case "char":
                char ch1 = scanner.nextLine().charAt(0);
                char ch2 = scanner.nextLine().charAt(0);
                System.out.println(getMax(ch1, ch2));
                break;
            case "string":
                String text1 = scanner.nextLine();
                String text2 = scanner.nextLine();
                System.out.println(getMax(text1, text2));
                break;
        }
    }
    private static int getMax(int num1, int num2) {

        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }
    public static char getMax(char ch1, char ch2){

        if (ch1 > ch2){
            return ch1;
        }
        else {
            return ch2;
        }
    }
    public static String getMax(String text1, String text2) {

        String result = "";

        if (text1.compareTo(text2) > 0) {
            result = text1;
        }
        else {
            result = text2;
        }
        return result;
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


