import java.util.Scanner;

public class Snowballs {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        double value = 0;
        double winner = 0;

        int snowWin = 0;
        int timeWin = 0;
        int qualityWin = 0;


        for (int i = 0; i < n; i++) {

            int snow = scanner.nextInt();
            int time = scanner.nextInt();
            int quality = scanner.nextInt();

            value = Math.pow((snow / time), quality);

            if ( value > winner){
                winner = value;
                 snowWin = snow;
                 timeWin = time;
                 qualityWin = quality;

            }
        }
        System.out.printf("%d : %d = %.0f (%d)", snowWin, timeWin, winner, qualityWin);
    }
}
