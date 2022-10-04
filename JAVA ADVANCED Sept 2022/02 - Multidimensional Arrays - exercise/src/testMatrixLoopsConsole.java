import java.util.Scanner;

public class testMatrixLoopsConsole {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrixList = new int[2][3];

        for (int r = 0; r < 2; r++) {
            String[] consoleRow = scanner.nextLine().split(" ");

            for (int c = 0; c < 3; c++) {
                matrixList[r][c] = Integer.parseInt(consoleRow[c]);

            }
        }
/*
         matrixList[0][0] = 1;
         matrixList[0][1] = 2;
         matrixList[0][2] = 3;
         matrixList[1][0] = 4;
         matrixList[1][1] = 5;
         matrixList[1][2] = 6;
         */

        for (int[] sM : matrixList){
            for (int el : sM){
                System.out.print(el + " ");
            }
            System.out.println();
        }
    }
}
