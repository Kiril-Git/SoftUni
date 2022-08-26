import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        int quantity = scanner.nextInt();

        printTotal(quantity, product);                           // num - Arguments
    }
    private static void printTotal(int quantity, String product) {

       if (product.equals("coffee")){
           System.out.printf("%.2f", quantity * 1.5);
       }
       else if (product.equals("water")){
           System.out.printf("%.2f", quantity * 1.0);
       }
       else if (product.equals("coke")) {
           System.out.printf("%.2f", quantity * 1.40);
       }
       else if (product.equals("snacks")) {
           System.out.printf("%.2f", quantity * 2.0);
       }
    }
}
// return - с return  се прекратява изпълнението на метода, дори това да е main method-a.

// DRY  -  Do not repeat yourself!!!
// WET  -  We enjoy typing!!!

// Всеки код е като книга, където:
// Методите са глаголите,
// а променливите - съществителните.


