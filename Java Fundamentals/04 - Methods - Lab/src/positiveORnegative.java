import java.util.Scanner;

public class positiveORnegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // DRY  -  Do not repeat yourself!!!
        // WET  -  We enjoy typing!!!

        // Всеки код е като книга, където:
        // Методите са глаголите,
        // а променливите - съществителните.

        int num = scanner.nextInt();

        signDefinition(num);                           // num - Arguments

    }
    public static void signDefinition(int num){        // num - parameters
        if (num > 0){
            System.out.printf("The number %d is positive.", num);
        }
        else if (num < 0){
            System.out.printf("The number %d is negative.", num);
        }
        else {
            System.out.printf("The number %d is zero.", num);
        }
    }

    }


