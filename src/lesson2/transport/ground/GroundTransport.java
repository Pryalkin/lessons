package lesson2.transport.ground;

import lesson2.transport.Transport;

public abstract class GroundTransport extends Transport {

    private int numberOfWheels;
    private double fuelConsumption;

    public GroundTransport(int power, double maxSpeed, int weight, String brand, int numberOfWheels, double fuelConsumption) {
        super(power, maxSpeed, weight, brand);
        this.numberOfWheels = numberOfWheels;
        this.fuelConsumption = fuelConsumption;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public String toString() {
        return super.toString() + " GroundTransport{" +
                "numberOfWheels=" + numberOfWheels +
                ", fuelConsumption=" + fuelConsumption +
                '}';
    }
}
