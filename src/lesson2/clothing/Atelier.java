package lesson2.clothing;

public class Atelier {

    public void dressAMan(Clothing[] clothing) {
        for (Clothing cl: clothing) {
            if (cl instanceof Tshirt ? true : cl instanceof Trousers ? true : cl instanceof Tie ? true : false){
                System.out.println(cl);
            }
        }
    }

    public void dressAWomen(Clothing[] clothing) {
        for (Clothing cl: clothing) {
            if (cl instanceof Tshirt ? true : cl instanceof Trousers ? true : cl instanceof Skirt ? true : false){
                System.out.println(cl);
            }
        }
    }
}
