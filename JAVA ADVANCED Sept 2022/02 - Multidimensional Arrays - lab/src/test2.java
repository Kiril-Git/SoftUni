 import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//      !!!   In programming, an array is a sequence of
//                          elements of the same type and fixed size and order.


        int[] arr1 = {13, 42};
        int[] arr2 = {69,73};

        int[][] arr = {
                arr1,
                arr2
        };


        int[][] matrix = new int[4][3];
        int[][][] matrix2 = new int[4][2][6];


        for (int[] el : matrix) {
            for (int els : el) {
                System.out.print(els);
            }
        }
    }
}
