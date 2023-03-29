package by.petrovich.car.service;

import by.petrovich.car.model.Car;
import by.petrovich.car.model.Engine;
import by.petrovich.car.model.FuelTank;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(new Engine("V300"), new FuelTank(1000.00));
        car.setBrand("Volvo");
        car.setManufactureYear(2018);
        System.out.println(car);
        car.launch();
        System.out.println(car);
        car.refuel(10);
        car.showFuelVolume();
        car.launch();
        System.out.println(car);
        car.ride();
        System.out.println(car);
        car.shutDown();
        System.out.println(car);
    }
}
