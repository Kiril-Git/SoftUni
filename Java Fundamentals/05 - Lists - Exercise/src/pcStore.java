import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class pcStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputln = scanner.nextLine();

        double sum = 0;
        double total = 0;
        double vat = 0;

        while (!inputln.equals("regular") && !inputln.equals("special")) {

            double price = Double.parseDouble(inputln);
            if (price < 0){
                System.out.println("Invalid price!" );
            }
            else {
                sum += price;
            }
            inputln = scanner.nextLine();
        }
        vat = sum * 0.2;
        if (inputln.equals("special")){
            total = (sum + vat) * 0.9;
        }
        else {
            total = sum + vat;
        }
        if (sum == 0){
            System.out.println("Invalid order!");
        }
        else {
            System.out.println("Congratulations you've just bought a new computer!");
            System.out.printf("Price without taxes: %.2f$\n", sum);
            System.out.printf("Taxes: %.2f$\n", vat);
            System.out.println("-----------");
            System.out.printf("Total price: %.2f$", total);
        }
    }
}
