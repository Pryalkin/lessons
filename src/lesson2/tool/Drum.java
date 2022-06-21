package lesson2.tool;

public class Drum implements Tool{

    private double size;

    public Drum(double size) {
        this.size = size;
    }

    @Override
    public void play() {
        System.out.println("Играет барабан с размером " + size);
    }
}
