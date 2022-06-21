package lesson2.tool;

public class Guitar implements Tool{

    private int numberOfStrings;

    public Guitar(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

    @Override
    public void play() {
        System.out.println("Играет гитара с " + numberOfStrings + " струнами");
    }
}
