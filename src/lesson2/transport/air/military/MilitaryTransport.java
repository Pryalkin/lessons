package lesson2.transport.air.military;

import lesson2.transport.air.AirTransport;

public class MilitaryTransport extends AirTransport {

    private boolean thePresenceOfABailoutSystem;
    private int numberOfMissilesOnBoard;


    public MilitaryTransport(int power, double maxSpeed, int weight, String brand, double wingspan, double minimumRunwayLengthForTakeoff) {
        super(power, maxSpeed, weight, brand, wingspan, minimumRunwayLengthForTakeoff);
        this.thePresenceOfABailoutSystem = thePresenceOfABailoutSystem;
        this.numberOfMissilesOnBoard = numberOfMissilesOnBoard;
    }

    public void takeAShot(){
        if (this.numberOfMissilesOnBoard == 0){
            System.out.println("Ракет 0!");
        } else {
            System.out.println("Ракета пошла…");
            this.numberOfMissilesOnBoard--;
        }
    }

    public void doABailout(){
        String line = this.thePresenceOfABailoutSystem ? "Катапультирование прошло успешно" : "У вас нет такой системы";
        System.out.println(line);
    }

    @Override
    public String toString() {
        return super.toString() + " MilitaryTransport{" +
                "thePresenceOfABailoutSystem=" + thePresenceOfABailoutSystem +
                ", numberOfMissilesOnBoard=" + numberOfMissilesOnBoard +
                '}';
    }
}
