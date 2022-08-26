import java.util.Scanner;

public class printTriangle2 {
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
               printLn(1, i);
        }
    }

    public static void printLn(int start, int end){
        for (int i = start; i <= end ; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void printUpsideDown(int num){

        for (int i = num-1; i >= 1 ; i--) {

           printLn(1, i);

        }

    }

}






