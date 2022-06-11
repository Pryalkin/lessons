package lesson2.human.shoes;

public class CrocsShoes implements IShoes{

    private int price;

    public CrocsShoes(int price) {
        this.price = price;
    }

    @Override
    public void putOn() {
        System.out.println("Надеть обувь от Crocs");
    }

    @Override
    public void takeOff() {
        System.out.println("Снять обувь от Crocs");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
