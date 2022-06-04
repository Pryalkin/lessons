package lessons3.human.shoes;

public class TimberlandShoes implements IShoes{

    private int price;

    public TimberlandShoes(int price) {
        this.price = price;
    }

    @Override
    public void putOn() {
        System.out.println("Надеть обувь от Timberland");
    }

    @Override
    public void takeOff() {
        System.out.println("Снять обувь от Timberland");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
