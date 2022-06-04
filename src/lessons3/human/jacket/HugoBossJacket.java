package lessons3.human.jacket;

public class HugoBossJacket implements IJacket{

    private int price;

    public HugoBossJacket(int price) {
        this.price = price;
    }

    @Override
    public void putOn() {
        System.out.println("Надеть куртку от Hugo Boss");
    }

    @Override
    public void takeOff() {
        System.out.println("Снять куртку от Hugo Boss");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
