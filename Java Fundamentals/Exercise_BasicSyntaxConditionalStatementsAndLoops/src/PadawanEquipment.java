import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = scanner.nextDouble();
        int studentsN = scanner.nextInt();
        double lightSabers = scanner.nextDouble();
        double robes = scanner.nextDouble();
        double belts = scanner.nextDouble();

        double lightSabersPlus = Math.ceil( studentsN * 1.1);
        double lightSabersSum = lightSabersPlus * lightSabers;
        int disc = studentsN - studentsN / 6;
        double beltsSum = disc  * belts;
        double robesSum = studentsN * robes;

        double sum = lightSabersSum + beltsSum + robesSum;

        if (sum <= budget){
            System.out.printf("The money is enough - it would cost %.2flv.", sum);
        }
        else {
            System.out.printf("George Lucas will need %.2flv more.", sum - budget);
        }
    }
}
