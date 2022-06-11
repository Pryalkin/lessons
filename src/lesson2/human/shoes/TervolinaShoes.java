package lesson2.human.shoes;

public class TervolinaShoes implements IShoes{

    private int price;

    public TervolinaShoes(int price) {
        this.price = price;
    }

    @Override
    public void putOn() {
        System.out.println("Надеть обувь от Tervolina");
    }

    @Override
    public void takeOff() {
        System.out.println("Снять обувь от Tervolina");
    }


    @Override
    public int getPrice() {
        return price;
    }
}
