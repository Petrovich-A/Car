package by.petrovich.car.model;

public class Car {
    private Engine engine;
    private FuelTank fuelTank;

    private String brand;
    private int manufactureYear;

    private double mileage;
    private final double DISTANCE_PER_RIDE = 10;
    private boolean isLaunched;

    public Car(Engine engine, FuelTank fuelTank) {
        this.engine = engine;
        this.fuelTank = fuelTank;
    }

    public Engine getEngine() {
        return engine;
    }

    private void setEngine() {
        this.engine = engine;
    }

    public FuelTank getFuelTank() {
        return fuelTank;
    }

    public void setFuelTank() {
        this.fuelTank = fuelTank;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public void setManufactureYear(int manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    public double getMileage() {
        return mileage;
    }

    private void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public boolean isLaunched() {
        return isLaunched;
    }

    private void setLaunched(boolean launched) {
        isLaunched = launched;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Car{");
        sb.append("engine=").append(engine);
        sb.append(", fuelTank=").append(fuelTank);
        sb.append(", brand='").append(brand).append('\'');
        sb.append(", manufactureYear=").append(manufactureYear);
        sb.append(", mileage=").append(mileage);
        sb.append(", DISTANCE_PER_RIDE=").append(DISTANCE_PER_RIDE);
        sb.append(", isLaunched=").append(isLaunched);
        sb.append('}');
        return sb.toString();
    }

    public boolean launch() {
        if (fuelTank.getFuelVolume() != 0) {
            isLaunched = engine.launch();
        }
        return isLaunched;
    }

    public void ride() {
        if (isLaunched) {
            mileage += DISTANCE_PER_RIDE;
            System.out.println("Car has rode " + DISTANCE_PER_RIDE);
        }
    }

    public void shutDown() {
        engine.shutDown();
        isLaunched = false;
    }

    public void printMileage() {
        System.out.println(mileage);
    }

    public double refuel(double fuelAmount) {
        return fuelTank.refuel(fuelAmount);
    }

    public void showFuelVolume(){
        fuelTank.printFuelAmount();
    }
}
