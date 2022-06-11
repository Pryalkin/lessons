package lesson2.human.jacket;

public class LacosteJacket implements IJacket{

    private int price;

    public LacosteJacket(int price) {
        this.price = price;
    }

    @Override
    public void putOn() {
        System.out.println("Надеть куртку от Lacoste");
    }

    @Override
    public void takeOff() {
        System.out.println("Снять куртку от Lacoste");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
