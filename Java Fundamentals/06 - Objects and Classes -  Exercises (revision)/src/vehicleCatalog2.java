//      list.stream().filter(vehicle -> vehicle.getModel().equals(temp))
//          .forEach(vehicle -> System.out.println(vehicle.toString()));

//      return String.format("Type: %s\nModel: %s\nColor: %s\nHorsepower: %.0f",
//          getType().toUpperCase().charAt(0) + getType().substring(1), model, color, hP);
//        }

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class vehicleCatalog2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        double carsHp = 0;
        double trucksHp = 0;

        List<Vehicle> list = new ArrayList<>();

        while (!input.equals("End")){

            String[] line = input.split(" ");

            String type = line[0];
            String model = line[1];
            String color = line[2];
            double hP = Double.parseDouble(line[3]);

            Vehicle vehicle = new Vehicle(type, model, color, hP);

            list.add(vehicle);

            List<Vehicle> cars = list.stream()
                    .filter(el -> el.getType().equals("car"))
                    .collect(Collectors.toList());

            List<Vehicle> trucks = list.stream()
                    .filter(el -> el.getType().equals("truck"))
                    .collect(Collectors.toList());

            carsHp = avHp(cars);
            trucksHp = avHp(trucks);

            input = scanner.nextLine();
        }

        input = scanner.nextLine();
        while (!input.equals("Close the Catalogue")){

            String temp = input;

           list.stream().filter(vehicle -> vehicle.getModel().equals(temp))
                   .forEach(vehicle -> System.out.println(vehicle.toString()));

            input = scanner.nextLine();
        }

            System.out.printf("Cars have average horsepower of: %.2f.\n", carsHp);
            System.out.printf("Trucks have average horsepower of: %.2f.\n", trucksHp);

    }

    static double avHp(List<Vehicle> vehicles){
        if (vehicles.size() == 0){
            return 0;
        }
        return vehicles.stream().mapToDouble(Vehicle::gethP).sum() / vehicles.size();
    }

    static class Vehicle {
        String type;
        String model;
        String color;
        double hP;

        public Vehicle(String type, String model, String color, double hP) {
            this.type = type;
            this.model = model;
            this.color = color;
            this.hP = hP;
        }

        public String getModel() {
            return model;
        }

        public double gethP() {
            return hP;
        }

        public String getType() {
            return type;
        }

        @Override
        public  String toString(){

            if (this.type.equals("car")){
                this.type = "Car";
            }
            else {
                this.type = "Truck";
            }

            return String.format("Type: %s\nModel: %s\nColor: %s\nHorsepower: %.0f",
                    getType().toUpperCase().charAt(0) + getType().substring(1), model, color, hP);
        }
    }
}
