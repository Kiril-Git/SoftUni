package vehicles;

public class Car extends VehicleImpl{

    public final static double AC_ADDITIONAL_CONSUMPTION = 0.9;

    public Car(double fuelQuantity, double fuelConsumption) {
        super(fuelQuantity, fuelConsumption);
        setFuelConsumption(getFuelConsumption() + AC_ADDITIONAL_CONSUMPTION);
    }



    @Override
    public void refuel(double liters) {
        setFuelQuantity(getFuelQuantity() + liters);
    }
}
