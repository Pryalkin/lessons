package lesson2.transport.air;

import lesson2.transport.Transport;

public abstract class AirTransport extends Transport {

    private double wingspan;
    private double minimumRunwayLengthForTakeoff;

    public AirTransport(int power, double maxSpeed, int weight, String brand,
                        double wingspan, double minimumRunwayLengthForTakeoff) {
        super(power, maxSpeed, weight, brand);
        this.wingspan = wingspan;
        this.minimumRunwayLengthForTakeoff = minimumRunwayLengthForTakeoff;
    }

    @Override
    public String toString() {
        return super.toString() + " AirTransport{" +
                "wingspan=" + wingspan +
                ", minimumRunwayLengthForTakeoff=" + minimumRunwayLengthForTakeoff +
                '}';
    }
}
