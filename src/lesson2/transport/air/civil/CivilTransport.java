package lesson2.transport.air.civil;

import lesson2.transport.air.AirTransport;

public class CivilTransport extends AirTransport {

    private int numberOfPassengers;
    private boolean availabilityOfBusinessClass;

    public CivilTransport (int power, double maxSpeed, int weight, String brand,
                           double wingspan, double minimumRunwayLengthForTakeoff,
                           int numberOfPassengers, boolean availabilityOfBusinessClass){
        super(power, maxSpeed, weight, brand, wingspan, minimumRunwayLengthForTakeoff);
        this.numberOfPassengers = numberOfPassengers;
        this.availabilityOfBusinessClass = availabilityOfBusinessClass;
    }

    public void checkingPassengerCapacity(int amount){
        String line = numberOfPassengers < amount ? "Вам нужен самолет побольше" : "Пассажиры успешно разместились";
        System.out.println(line);
    }

    @Override
    public String toString() {
        return super.toString() + " CivilTransport{" +
                "numberOfPassengers=" + numberOfPassengers +
                ", availabilityOfBusinessClass=" + availabilityOfBusinessClass +
                '}';
    }
}
