package vehicleCatalog;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<Vehicle> list = new ArrayList<>();

        double cars = 0;
        int carsN = 0;
        double trucks = 0;
        int truckN = 0;

        while (!input.equals("End")){

            String[] line = input.split(" ");

            String type = line[0];
            String model = line[1];
            String color = line[2];
            double hP = Double.parseDouble(line[3]);

            if (type.equals("car")){
                cars += hP;
                carsN++;
            }
            else if (type.equals("truck")){

                trucks += hP;
                truckN++;
            }

            Vehicle vehicle = new Vehicle(type, model, color, hP);

            list.add(vehicle);

            input = scanner.nextLine();
        }
        String line = scanner.nextLine();
        while (!line.equals("Close the Catalogue")){

            String temp = line;

            for (Vehicle el : list){

                if (temp.equals(el.getModel())){
                    System.out.println(el);
                    break;
                }
            }
            line = scanner.nextLine();
        }

        if (cars != 0) {
            System.out.printf("Cars have average horsepower of: %.2f.\n", cars / carsN);
        }
        else {
            System.out.println("Cars have average horsepower of: 0.00.");
        }
        if (trucks != 0) {
            System.out.printf("Trucks have average horsepower of: %.2f.\n", trucks / truckN);
        }
        else {
            System.out.println("Trucks have average horsepower of: 0.00." );
        }
    }
}
