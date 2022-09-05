package vehicleCatalog;

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
