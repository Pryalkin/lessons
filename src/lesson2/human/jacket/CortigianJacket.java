package lesson2.human.jacket;

public class CortigianJacket implements IJacket{

    private int price;

    public CortigianJacket(int price) {
        this.price = price;
    }

    @Override
    public void putOn() {
        System.out.println("Надеть куртку от Cortigian");
    }

    @Override
    public void takeOff() {
        System.out.println("Снять куртку от Cortigian");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
