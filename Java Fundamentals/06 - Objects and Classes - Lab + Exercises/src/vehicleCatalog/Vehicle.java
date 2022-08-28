package vehicleCatalog;

import java.util.Locale;

public class Vehicle {

//   Характеристики -> полета      better set as private
    private String type;
    private String made;
    private String color;
    private int horsePower;

//    Automatically generating constructor, getter and setters etc.  by:
//    Shift + alt + Numpad-0

    //    Конструктор -> създаваме обекти - public

    public Vehicle(String type, String made, String color, int horsePower) {

        //        нов обект
        this.type = type;
        this.made = made;
        this.color = color;
        this.horsePower = horsePower;
    }
//    Methods:


    public String getMade(){
        return this.made;
    }

    //                              "{first name} {second name}: {grade}"
    @Override
    public String toString() {
        if (this.type.equals("car")){
            this.type = "Car";
        }
        else {
            this.type = "Truck";
        }
        return String.format("Type: %s\nModel: %s\nColor: %s\nHorsepower: %d"
                , this.type, this.made, this.color, this.horsePower);
    }
}
