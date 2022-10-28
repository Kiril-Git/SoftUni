import java.util.Scanner;

public class Bee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        char[][] territory = new char[n][n];
        int beeRow = 0;
        int beeCol = 0;

        for (int i = 0; i < n; i++) {

            char[] row = scanner.nextLine().toCharArray();

            for (int j = 0; j < n; j++) {
                territory[i][j] = row[j];

                if (territory[i][j] == 'B'){
                    beeRow = i;
                    beeCol = j;
                }
            }
        }
        int pollinatedF = 0;

        String command = scanner.nextLine();

        while (!command.equals("End")){

            territory[beeRow][beeCol] = '.';        //  current index

            if (command.equals("right") & beeCol < n-1){

                beeCol++;
            }
            else if (command.equals("left") & beeCol > 0){

                beeCol--;
            }
            else if (command.equals("up") & beeRow > 0){

                beeRow--;
            }
            else if (command.equals("down") & beeRow < n-1){

                beeRow++;
            }
            else {
                territory[beeRow][beeCol] = '.';
                System.out.println("The bee got lost!");
                break;
            }
            if (territory[beeRow][beeCol] == 'f'){
                pollinatedF++;
            }
            else if (territory[beeRow][beeCol] == 'O'){
                continue;
            }
            territory[beeRow][beeCol] = 'B';        //  new index

            command = scanner.nextLine();
            
        }
        if (pollinatedF < 5){
            System.out.printf("The bee couldn't pollinate the flowers, she needed %d flowers more\n", 5 - pollinatedF);
        }
        else {
            System.out.printf("Great job, the bee manage to pollinate %d flowers!\n", pollinatedF);
        }
        printTerritory(n, territory, beeRow, beeCol);

    }

    private static void printTerritory(int n, char[][] territory, int beeRow, int beeCol) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(territory[i][j]);
            }
            System.out.println();
        }
    }
}
