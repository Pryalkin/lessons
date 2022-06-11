package lesson2.human.pants;

public class GantPants implements IPants{

    private int price;

    public GantPants(int price) {
        this.price = price;
    }

    @Override
    public void putOn() {
        System.out.println("Надеть штаны от Gant");
    }

    @Override
    public void takeOff() {
        System.out.println("Снять штаны от Gant");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
