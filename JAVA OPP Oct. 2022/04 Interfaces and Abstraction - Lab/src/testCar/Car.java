package testCar;

import java.util.Scanner;

public class Car {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    }

    public Car(Engine engine) {
        this.engine = engine;
    }

    Engine engine;

    public void startCar(){
        engine.start();
    }

    public void stopCar(){
        engine.stop();
    }
}
