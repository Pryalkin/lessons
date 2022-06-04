package lesson2.transport.ground.freight;

import lesson2.transport.ground.GroundTransport;

public class FreightTransport extends GroundTransport {

    private double loadCapacity;

    public FreightTransport(int power, double maxSpeed, int weight, String brand, int numberOfWheels, double fuelConsumption, double loadCapacity) {
        super(power, maxSpeed, weight, brand, numberOfWheels, fuelConsumption);
        this.loadCapacity = loadCapacity;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public void loadCargo(int ton){
        String line = getLoadCapacity() < ton ? "Вам нужен грузовик побольше" : "Грузовик загружен";
        System.out.println(line);
    }

    @Override
    public String toString() {
        return super.toString() + " FreightTransport{" +
                "loadCapacity=" + loadCapacity +
                '}';
    }
}
