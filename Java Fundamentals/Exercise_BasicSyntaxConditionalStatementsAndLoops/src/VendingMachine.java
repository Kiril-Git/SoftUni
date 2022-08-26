import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        String input = scanner.nextLine();

        double balance = 0.0;

        while (!input.equals("Start")){
            double coins = Double.parseDouble(input);

            if (coins == 0.1 || coins == 0.2 || coins == 0.5 || coins == 1 || coins == 2) {

                balance += coins;
            }
            else {
                System.out.printf("Cannot accept %.2f\n", coins);
            }
            input = scanner.nextLine();
        }
        String item = scanner.nextLine();
        while (!item.equals("End")){

            switch (item){
                case "Nuts":
                    if (balance >= 2.0){
                        balance -= 2;
                        System.out.println("Purchased Nuts");
                    }
                    else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Water":
                    if (balance >= 0.7){
                        balance -= 0.7;
                        System.out.println("Purchased Water");
                    }
                    else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Crisps":
                    if (balance >= 1.5){
                        balance -= 1.5;
                        System.out.println("Purchased Crisps");
                    }
                    else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Soda":
                    if (balance >= 0.8){
                        balance -= 0.8;
                        System.out.println("Purchased Soda");
                    }
                    else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Coke":
                    if (balance >= 1.0){
                        balance -= 1;
                        System.out.println("Purchased Coke");
                    }
                    else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                default:
                    System.out.println("Invalid product");
                    break;
            }

            item = scanner.nextLine();
        }
        System.out.printf("Change: %.2f", balance);
    }
}


//  select multiple variables to rename                          Shift + F6

//  https://softuni.bg/trainings/3366/java-fundamentals-may-2021?fbclid=IwAR3PdAD6dtlD0iqlieEh40elTWq
//  -0fFVuGy7ID8355YI2ZyLKlAd3nlkM0Q#lesson-28115

//  https://softuni.bg/trainings/2440/java-fundamentals-september-2019#lesson-12566
