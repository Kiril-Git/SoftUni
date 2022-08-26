import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
	// write your code here

        int[] numbersArr = new int[4];
        numbersArr[0] = 2;
        numbersArr[1] = 3;
        numbersArr[2] = numbersArr[1] + numbersArr[0];
        numbersArr[3] = 11;

        int temp = numbersArr[3];


        for (int i = 0; i < numbersArr.length; i++) {

            System.out.print(numbersArr[i] + " ");
        }
        System.out.println("\n" + temp);
    }
}
