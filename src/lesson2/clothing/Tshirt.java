package lesson2.clothing;

public class Tshirt extends Clothing implements MensClothing, WomensClothing{

    public Tshirt(ClothingSizes clothingSize, int price, String color) {
        super(clothingSize, price, color);
    }

    @Override
    public void dressAMan() {
        System.out.println("Надеть на мужчину футболку");
    }

    @Override
    public void dressAWomen() {
        System.out.println("Надеть на женщину футболку");
    }
}
