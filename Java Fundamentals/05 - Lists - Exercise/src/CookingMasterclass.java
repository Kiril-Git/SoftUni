import java.util.Scanner;

public class CookingMasterclass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = scanner.nextDouble();
        int students = scanner.nextInt();
        double flour = scanner.nextDouble();
        double egg = scanner.nextDouble();
        double apron = scanner.nextDouble();

        double apronNum = Math.ceil(students * 1.2);
        double sumApron = apron * apronNum;
        double sumEggs = egg * 10 * students;
        double sumFlour = flour * students;

        double disc = 0;

        if (students >= 5){

            int packs = students / 5;
            disc = packs * flour;
            sumFlour -= disc;
        }
        double sum = sumApron + sumEggs + sumFlour;

        double diff = Math.abs(budget - sum);
        if (sum <= budget) {
            System.out.printf("Items purchased for %.2f$.", sum);
        }
        else {
            System.out.printf("%.2f$ more needed.", diff);
        }
    }
}
