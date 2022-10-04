import java.util.Arrays;
import java.util.Scanner;

public class testMatrixLoopsConsole2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrixList = new int[2][3];

        readMatrix(scanner, matrixList);
/*
         matrixList[0][0] = 1;
         matrixList[0][1] = 2;
         matrixList[0][2] = 3;
         matrixList[1][0] = 4;
         matrixList[1][1] = 5;
         matrixList[1][2] = 6;
         */
        printMatrix(matrixList);
    }

    private static void printMatrix(int[][] matrixList) {
        for (int[] sM : matrixList){
            for (int el : sM){
                System.out.print(el + " ");
            }
            System.out.println();
        }
    }

    private static void readMatrix(Scanner scanner, int[][] matrixList) {
        for (int r = 0; r < 2; r++) {

            matrixList[r] = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }
    }
}
