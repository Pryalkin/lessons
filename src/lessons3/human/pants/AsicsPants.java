package lessons3.human.pants;

public class AsicsPants implements IPants{

    private int price;

    public AsicsPants(int price) {
        this.price = price;
    }

    @Override
    public void putOn() {
        System.out.println("Надеть штаны от Asics");
    }

    @Override
    public void takeOff() {
        System.out.println("Снять штаны от Asics");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
