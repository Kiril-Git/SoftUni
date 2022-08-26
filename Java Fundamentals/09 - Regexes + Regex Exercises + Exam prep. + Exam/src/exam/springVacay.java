package exam;

import java.util.Scanner;

public class springVacay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());
        int members = Integer.parseInt(scanner.nextLine());
        double fuelCostKm = Double.parseDouble(scanner.nextLine());
        double foodCostMem = Double.parseDouble(scanner.nextLine());
        double accommodationNightMem = Double.parseDouble(scanner.nextLine());

        double sum = 0;
        int day = 0;

        double food = members * foodCostMem * days;
        double accommodation = members * accommodationNightMem * days;
        if (members > 10){
            accommodation *= 0.75;
        }
        sum = food + accommodation;

        double kmsDay = Double.parseDouble(scanner.nextLine());

        while (day < days || sum > budget) {

            double fuel = kmsDay * fuelCostKm;
            sum += fuel;
            day ++;

            if (day % 3 == 0 || day % 5 == 0 ){
                sum *= 1.4;
            }
            else if (day == 7){
                sum = sum - sum/members;
            }
            if (days == day || sum > budget) {
                break;
            }
            kmsDay = Double.parseDouble(scanner.nextLine());
        }
        double diff = Math.abs(budget - sum);

        if (budget >= sum) {
            System.out.printf("You have reached the destination. You have %.2f$ budget left.\n", diff);
        }
        else {
            System.out.printf("Not enough money to continue the trip. You need %.2f$ more.\n", diff);
        }
    }
}
