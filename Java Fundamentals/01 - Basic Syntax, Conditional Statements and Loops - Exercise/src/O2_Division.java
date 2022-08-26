import java.util.Scanner;

public class O2_Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int output = 0;
        
        if (num % 10 == 0 ){
            output = 10;
        }
        else if (num % 7 == 0){
            output = 7;
        }
        else if (num % 6 == 0){
            output = 6;
        }
        else if (num % 3 == 0){
            output = 3;
        }
        else if (num % 2 == 0){
            output = 2;
        }
        if (output != 0) {
            System.out.println("The number is divisible by " + output);
        }
        else {
            System.out.println("Not divisible");
        }
    }
}
