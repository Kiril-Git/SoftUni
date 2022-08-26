import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // DRY  -  Do not repeat yourself!!!
        // WET  -  We enjoy typing!!!

        // Всеки код е като книга, където:
        // Методите са глаголите,
        // а променливите - съществителните.

        int a = 1;
        int b = 5;

        printNumbers(a, b);                                      //     a & b - Arguments

    }
    public static void printNumbers(int start, int end){        // start & end - parameters
        for (int i = start; i <= end ; i++) {
            System.out.printf("%d ", i);

        }
    }

    }


