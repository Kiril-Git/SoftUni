import java.util.Scanner;

public class printTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // DRY  -  Do not repeat yourself!!!
        // WET  -  We enjoy typing!!!

        // Всеки код е като книга, където:
        // Методите са глаголите,
        // а променливите - съществителните.

        int num = scanner.nextInt();

        printTriangle(num);
        printUpsideDown(num);                                //     a & b - Arguments

    }

    public static void printTriangle(int num) {        // start & end - parameters

        for (int i = 1; i <= num; i++) {

            for (int j = 1; j <= i; j++)

                System.out.print(j + " ");
            System.out.println();

        }
    }
    public static void printUpsideDown(int num){

        for (int i = num; i > 0 ; i--) {

            for (int j = i; j < num; j++)
                System.out.print(j + " ");
            System.out.println();

        }

    }

}






