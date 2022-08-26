import java.util.Scanner;

public class SmallestNum2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        getSmallestNum(num1, num2, num3);
    }
    private static void getSmallestNum(int num1, int num2, int num3) {

        //  int smallest = Integer.MAX_VALUE;

        if (num1 <= num2 && num2 <= num3){
            System.out.println(num1);
        }
        else if (num2 <= num1 && num2 <= num3){
            System.out.println(num2);
        }
        else {
            System.out.println(num3);
        }
    }
}


