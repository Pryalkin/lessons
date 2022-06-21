package lesson2.transport.ground.passenger;

import lesson2.transport.ground.GroundTransport;

public class PassengerTransport extends GroundTransport {

    private String bodyType;

    public PassengerTransport(int power, double maxSpeed, int weight, String brand, int numberOfWheels, double fuelConsumption, String bodyType) {
        super(power, maxSpeed, weight, brand, numberOfWheels, fuelConsumption);
        this.bodyType = bodyType;
    }

    public void method(int second) {
        double timeInHours = second/60/60;
        System.out.println("За время " + timeInHours + " часа, автомобиль " + getBrand() + " двигаясь с максимальной скоростью " + getMaxSpeed() + " км/ч израсходует " + timeInHours*getMaxSpeed()/100*getFuelConsumption() + " литров топлива");
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public void calculateExpenses(int second){
        double distance = getMaxSpeed()*(second/60/60);
        System.out.println("Машина проедет: " + distance + " км и расходует " + calculateTotalFuelConsumption(distance) + " литром топлива.");
    }

    private double calculateTotalFuelConsumption(double distance) {
        return distance/100*getFuelConsumption();
    }

    @Override
    public String toString() {
        return super.toString() + " PassengerTransport{" +
                "bodyType='" + bodyType + '\'' +
                '}';
    }
}
