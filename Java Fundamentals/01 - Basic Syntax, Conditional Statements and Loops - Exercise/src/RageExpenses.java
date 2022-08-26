import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGames = scanner.nextInt();
        double headset = scanner.nextDouble();
        double mouse  = scanner.nextDouble();
        double keyboard  = scanner.nextDouble();
        double display = scanner.nextDouble();

        int headsetN = lostGames / 2;
        int mouseN = lostGames / 3;
        int keyboardN = lostGames / 6;
        int displayN = lostGames / 12;

        double headsetSum = headset * headsetN;
        double mouseSum = mouse * mouseN;
        double keyboardSum = keyboard * keyboardN;
        double displaySum = display * displayN;

        double sum = headsetSum + mouseSum + keyboardSum + displaySum;

        System.out.printf("Rage expenses: %.2f lv.", sum);

    }
}
