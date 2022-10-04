import java.util.Scanner;

public class fillingMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] line = scanner.nextLine().split(", ");

        int n = Integer.parseInt(line[0]);

        int counter = 1;
        int[][] matrixList = new int[n][n];

        for (int c = 0; c < n; c++) {
            for (int r = 0; r < n; r++) {

                matrixList[r][c] = counter;
                counter++;

            }
        }


        for (int[] sM : matrixList){
            for (int el : sM){
                System.out.print(el + " ");
            }
            System.out.println();
        }
    }
}
