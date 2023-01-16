package vehicles;

import java.text.DecimalFormat;

public class Truck extends VehicleImpl{

    public final static double AC_ADDITIONAL_CONSUMPTION = 1.6;
    public final static double FUEL_LEAK_LOSES_COEFFICIENT = 0.95;

    public Truck(double fuelQuantity, double fuelConsumption) {
        super(fuelQuantity, fuelConsumption + AC_ADDITIONAL_CONSUMPTION);
    }

    @Override
    public void refuel(double liters) {
        setFuelQuantity(getFuelQuantity() * FUEL_LEAK_LOSES_COEFFICIENT);
    }
}
