package vehicleCatalog;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        String input = scanner.nextLine();

        List<Vehicle> list = new ArrayList<>();

        double cars = 0.0;
        int carsN = 0;
        double trucks = 0.0;
        int trucksN = 0;

        while (!input.equals("End")){

            String[] inputLn = input.split(" ");

            String type = inputLn[0];
            String made = inputLn[1];
            String color = inputLn[2];
            int horsePower = Integer.parseInt(inputLn[3]);

            if (inputLn[0].equals("truck")){
                trucks += horsePower;
                trucksN++;
            }
            else {
                cars += horsePower;
                carsN++;
            }
            Vehicle vehicle = new Vehicle(type, made, color, horsePower);
            list.add(vehicle);

            input = scanner.nextLine();
        }
        String input2 = scanner.nextLine();

        while (!input2.equals("Close the Catalogue")){

            for (Vehicle el : list){

                if (input2.equals(el.getMade())){
                    System.out.println(el);
                    break;
                }
            }
            input2 = scanner.nextLine();
        }
        double sumCars = cars / carsN;
        double sumTrucks = trucks / trucksN;

        if (sumCars != 0) {
            System.out.printf("Cars have average horsepower of: %.2f.\n", sumCars);
        }
        else {
            System.out.println("Cars have average horsepower of: 0.00.");
        }
        if (sumTrucks != 0) {
            System.out.printf("Trucks have average horsepower of: %.2f.\n", sumTrucks);
        }
        else {
            System.out.println("Trucks have average horsepower of: 0.00.");
        }
    }
}
