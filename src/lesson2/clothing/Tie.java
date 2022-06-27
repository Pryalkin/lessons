package lesson2.clothing;

public class Tie extends Clothing implements MensClothing{

    public Tie(ClothingSizes clothingSize, int price, String color) {
        super(clothingSize, price, color);
    }

    @Override
    public void dressAMan() {
        System.out.println("Надеть на мужчину галстук");
    }
}
