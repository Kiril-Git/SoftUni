import java.util.Scanner;

public class RectangleAreaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double width = scanner.nextDouble();
        double height = scanner.nextDouble();

        getArea (width, height);                           // num - Arguments

        double area = getArea(width, height);
        System.out.printf("%.0f", area);

    }
    private static double getArea(double width, double height) {

    //  double area = width * height;
        return width * height;      // area
    }
}
// return - с return  се прекратява изпълнението на метода, дори това да е main method-a.

// DRY  -  Do not repeat yourself!!!
// WET  -  We enjoy typing!!!

// Всеки код е като книга, където:
// Методите са глаголите,
// а променливите - съществителните.


