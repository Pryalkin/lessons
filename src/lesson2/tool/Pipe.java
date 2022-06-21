package lesson2.tool;

public class Pipe implements Tool{

    private double diameter;

    public Pipe(double diameter) {
        this.diameter = diameter;
    }

    @Override
    public void play() {
        System.out.println("Играет труба в " + KEY + " c диаметром " + diameter);
    }
}
