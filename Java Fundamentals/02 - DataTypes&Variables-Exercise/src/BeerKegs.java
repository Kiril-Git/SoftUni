import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        double vol = 0;
        double winner = 0;
        String modWinner = "";

        for (int i = 1; i <= n; i++) {

            String mod = scanner.nextLine();
            double rad = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            vol = Math.PI * Math.pow(rad, 2) * height;

            if (vol > winner){
                winner = vol;
                modWinner = mod;
            }
        }
        System.out.println(modWinner);
    }
}
