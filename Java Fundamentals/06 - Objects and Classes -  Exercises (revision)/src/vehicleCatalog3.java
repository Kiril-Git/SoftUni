
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class vehicleCatalog3 {
    public void main(String[] args) {
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
        input = scanner.nextLine();
        while (!input.equals("Close the Catalogue")){

            String temp = input;

            for (Vehicle el : list){

                if (temp.equals(el.getModel())){
                    System.out.println(el);
                    break;
                }
            }
            input = scanner.nextLine();
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

    public class Vehicle {
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


        @Override
        public  String toString(){

            if (this.type.equals("car")){
                this.type = "Car";
            }
            else {
                this.type = "Truck";
            }

            return String.format("Type: %s\nModel: %s\nColor: %s\nHorsepower: %.0f",
                    type, model, color, hP);
        }
    }

}
