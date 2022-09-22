//        Arrays.deepEquals(app1, app2);    compare matrices method

import java.util.Arrays;
import java.util.Scanner;

public class compareMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int arraysNum = scanner.nextInt();
        int arraysSize = scanner.nextInt();

        int[][] firstMatrix = new int[arraysNum][arraysSize];

        for (int r = 0; r < arraysNum; r++) {
            for (int c = 0; c < arraysSize; c++) {
                firstMatrix[r][c] = scanner.nextInt();
            }
        }
         arraysNum = scanner.nextInt();
         arraysSize = scanner.nextInt();

        int[][] secondMatrix = new int[arraysNum][arraysSize];

        for (int r = 0; r < arraysNum; r++) {
            for (int c = 0; c < arraysSize; c++) {
                secondMatrix[r][c] = scanner.nextInt();
            }
        }
        boolean equal = firstMatrix.length == secondMatrix.length &
             isEqual(firstMatrix, secondMatrix);


        System.out.println(equal ? "equal" : "not equal");
    }

    private static boolean isEqual(int[][] firstMatrix, int[][] secondMatrix ) {

        for (int r = 0; r < firstMatrix.length; r++) {

            int[] arr1 = firstMatrix[r];
            int[] arr2 = secondMatrix[r];

            if (arr1.length != arr2.length){
                return false;
            }

                for (int i = 0; i < arr1.length; i++) {

                    int temp1 = arr1[i];
                    int temp2 = arr2[i];

                    if (temp1 != temp2) {
                        return false;
                    }
                }
             }
        return true;
    }
}