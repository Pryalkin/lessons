package lesson2.clothing;

public abstract class Clothing {

    private ClothingSizes clothingSize;
    private int price;
    private String color;

    public Clothing(ClothingSizes clothingSize, int price, String color) {
        this.clothingSize = clothingSize;
        this.price = price;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Clothing{" +
                "clothingSize=" + clothingSize +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
