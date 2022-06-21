package lesson1.clothing;

public class Skirt extends Clothing implements WomensClothing{

    public Skirt(ClothingSizes clothingSize, int price, String color) {
        super(clothingSize, price, color);
    }

    @Override
    public void dressAWomen() {
        System.out.println("Надеть на женщину юбку");
    }
}
