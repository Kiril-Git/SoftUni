import java.util.Arrays;
import java.util.Scanner;

public class О3intersectedEls {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());

        Character[][] matrix1 =  readMatrix(scanner, rows, cols);
        Character[][] matrix2 =  readMatrix(scanner, rows, cols);

        Character[][] intersect = matrix1.clone();

        for (int r = 0; r < rows; r++) {

            for (int i = 0; i < cols; i++) {

                if (matrix1[r][i] != matrix2[r][i])
                                            intersect[r][i] = '*';
            }
        }
        for (Character[] el : intersect){
            for (Character i : el){
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }

    private static Character[][] readMatrix(Scanner scanner, int rows, int cols) {

        Character [][] matrix = new Character[rows][cols];
        for (int i = 0; i < rows; i++) {

            matrix[i] = Arrays.stream(scanner.nextLine().split(" "))
                    .map(e -> e.charAt(0))
                    .toArray(Character[] :: new);

        }
        return matrix;
    }
}
