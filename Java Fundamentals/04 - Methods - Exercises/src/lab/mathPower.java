package lab;

//              DecimalFormat df = new DecimalFormat("0.####");
//                      System.out.println(df.format(result));

//              private static double powerRaising(double num, int pow) {
//                      return result;
//                      }

import java.text.DecimalFormat;
import java.util.Scanner;

public class mathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num = Double.parseDouble(scanner.nextLine());
        int pow = Integer.parseInt(scanner.nextLine());

        double result = powerRaising(num, pow);

        DecimalFormat df = new DecimalFormat("0.####");

        System.out.println(df.format(result));

    }

    private static double powerRaising(double num, int pow) {

        double result = num;

        for (int i = 1; i < pow; i++) {

            result *= num;
        }
        return result;
    }
}
