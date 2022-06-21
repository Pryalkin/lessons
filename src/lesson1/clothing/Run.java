package lesson1.clothing;

public class Run {
    public static void main(String[] args) {
        Atelier atelier = new Atelier();
        Clothing tshirt1 = new Tshirt(ClothingSizes.M, 34, "Red");
        Clothing tshirt2 = new Tshirt(ClothingSizes.L, 45, "Blue");
        Clothing tie1 = new Tie(ClothingSizes.XXS, 23, "Grey");
        Clothing tie2 = new Tie(ClothingSizes.XS, 45, "Blue");
        Clothing skirt1 = new Skirt(ClothingSizes.S, 31, "Yellow");
        Clothing skirt2 = new Tshirt(ClothingSizes.L, 49, "Orange");
        Clothing trousers1 = new Trousers(ClothingSizes.XXS, 29, "Blue");
        Clothing trousers2 = new Trousers(ClothingSizes.S, 45, "Red");
        Clothing[] clothing = new Clothing[]{tshirt1, tshirt2, tie1, tie2, skirt1, skirt2, trousers1, trousers2};
        atelier.dressAMan(clothing);
    }

}
