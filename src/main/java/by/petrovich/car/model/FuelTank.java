package by.petrovich.car.model;

public class FuelTank {
    private double fuelVolume;
    private final double volume;

    public FuelTank(double volume) {
        this.fuelVolume = 0;
        this.volume = volume;
    }

    public double getFuelVolume() {
        return fuelVolume;
    }

    public void setFuelVolume(double fuelVolume) {
        this.fuelVolume = fuelVolume;
    }

    public void printFuelAmount() {
        System.out.println("Fuel volume: " + getFuelVolume());
    }

    public double getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("FuelTank{");
        sb.append("fuelVolume=").append(fuelVolume);
        sb.append(", volume=").append(volume);
        sb.append('}');
        return sb.toString();
    }

    public double refuel(double fuelAmount) {
        if (this.fuelVolume + fuelAmount <= volume) {
            this.fuelVolume += fuelAmount;
        }
        return fuelVolume;
    }
}
