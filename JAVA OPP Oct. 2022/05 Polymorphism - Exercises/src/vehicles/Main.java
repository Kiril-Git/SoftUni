package vehicles;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Vehicle car = getVehicle(scanner);
        Vehicle truck = getVehicle(scanner);

        Map<String, Vehicle> vehicleMap = new LinkedHashMap<>();
        vehicleMap.put("Car", getVehicle(scanner));
        vehicleMap.put("Truck", getVehicle(scanner));

        int commandsN = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < commandsN; i++) {
            String[] line = scanner.nextLine().split(" ");

            String command = line[0];
            String vehicleType = line[1];
            double value = Double.parseDouble(line[2]);

            switch (command){
                case "Drive":
                    vehicleMap.get(vehicleType).drive(value);
                    break;
                case "Refuel":
                   vehicleMap.get(vehicleType).refuel(value);
                    break;
            }
        }
        vehicleMap.values().forEach(System.out::println);
    }

    private static Vehicle getVehicle(Scanner scanner) {
        String[] input = scanner.nextLine().split(" ");
        String type = input[0];
        double fuelAmount = Double.parseDouble(input[1]);
        double fuelConsumption = Double.parseDouble(input[2]);

        switch (type){
            case "Car":
                return new Car(fuelAmount, fuelConsumption);
            case "Truck":
                return new Truck(fuelAmount, fuelConsumption);
            default:
                throw new  IllegalArgumentException("This vehicle is not supported.");
        }
    }
}
