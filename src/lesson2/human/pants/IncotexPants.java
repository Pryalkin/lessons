package lesson2.human.pants;

public class IncotexPants implements IPants{

    private int price;

    public IncotexPants(int price) {
        this.price = price;
    }

    @Override
    public void putOn() {
        System.out.println("Надеть штаны от Incotex");
    }

    @Override
    public void takeOff() {
        System.out.println("Снять штаны от Incotex");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
