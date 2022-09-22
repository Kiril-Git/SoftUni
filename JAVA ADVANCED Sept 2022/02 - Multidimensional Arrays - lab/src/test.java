import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//      !!!   In programming, an array is a sequence of
//                          elements of the same type and fixed size and order.

        int n = Integer.parseInt(scanner.nextLine());

        int[] arr1 = {13, 42};
        int[] arr2 = {69,73};

        int[][] arr = {
                arr1,
                arr2
        };

        int[] studentNum = new int[n];

        for (int i = 0; i < n; i++) {

             int number = Integer.parseInt(scanner.nextLine());

             studentNum[i] = number;

        }

        for (int el : studentNum) {
            System.out.print(el + " ");
        }
    }
}
