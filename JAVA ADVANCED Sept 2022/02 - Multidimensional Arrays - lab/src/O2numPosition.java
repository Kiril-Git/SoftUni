import java.util.Arrays;
import java.util.Scanner;

public class O2numPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrix = readMatrix(scanner);
        int soughtNum = Integer.parseInt(scanner.nextLine());
        searchNum(matrix, soughtNum);

    }



    private static int[][] readMatrix(Scanner scanner) {
        int[] dimensions;
        int row, col;
        dimensions = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        row = dimensions[0];
        col = dimensions[1];
        int[][] matrix = new int[row][col];

        for (int i = 0; i < row; i++) {
            matrix[i] = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

        }
        return matrix;
    }

    private static void searchNum(int[][] matrix, int soughtNum) {

        boolean nailedIt = false;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == soughtNum){
                    System.out.println(i + " " + j);
                    nailedIt = true;
                }
            }
        }
        if (!nailedIt) {
            System.out.println("not found");
        }
    }
}
