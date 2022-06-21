package lesson1.clothing;

public class Trousers extends Clothing implements MensClothing, WomensClothing{

    public Trousers(ClothingSizes clothingSize, int price, String color) {
        super(clothingSize, price, color);
    }

    @Override
    public void dressAMan() {
        System.out.println("Надеть на мужчину штаны");
    }

    @Override
    public void dressAWomen() {
        System.out.println("Надеть на женщину штаны");
    }
}
