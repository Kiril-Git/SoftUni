import java.util.Arrays;
import java.util.Scanner;

public class numPosition2 {
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

        StringBuilder output = new StringBuilder();
        for (int arr = 0; arr < matrix.length; arr++) {
            for (int el = 0; el < matrix[0].length; el++) {
                if (matrix[arr][el] == soughtNum){
                    output.append(arr).append(" ").append(el).append(System.lineSeparator());
                }
            }
        }
            System.out.println(output.isEmpty() ? "not found" : output);
    }
}
