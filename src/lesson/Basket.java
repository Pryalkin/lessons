package lesson;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    private List<Product> purchasedGoods;

    public Basket(Product[] purchasedGoods) {
        this.purchasedGoods = new ArrayList();
    }

    public void addProduct(Product product){
        purchasedGoods.add(product);
    }

}
