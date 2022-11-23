package testCar;

public class DieselEngine implements FuelEngine{
    

    @Override
    public void start() {

        System.out.println("Start Diesel Engine!");
    }

    @Override
    public void stop() {

        System.out.println("Stop Diesel Engine!");
    }

    @Override
    public void refuel() {

        System.out.println("I'm refueling");
    }
}
