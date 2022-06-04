package lessons3.human;

import lessons3.human.jacket.CortigianJacket;
import lessons3.human.jacket.HugoBossJacket;
import lessons3.human.jacket.IJacket;
import lessons3.human.jacket.LacosteJacket;
import lessons3.human.pants.AsicsPants;
import lessons3.human.pants.GantPants;
import lessons3.human.pants.IncotexPants;
import lessons3.human.shoes.CrocsShoes;
import lessons3.human.shoes.TervolinaShoes;
import lessons3.human.shoes.TimberlandShoes;

public class Run {
    public static void main(String[] args) {
        IHuman maxim = new Human("Maxim", new CortigianJacket(56), new AsicsPants(89), new CrocsShoes(102));
        IHuman denis = new Human("Denis", new HugoBossJacket(42), new GantPants(67), new TimberlandShoes(142));
        IHuman vitya = new Human("Vitya", new LacosteJacket(54), new IncotexPants(78), new TervolinaShoes(89));
        System.out.println("Одежда " + maxim.getName() + " стоит: " + maxim.getPrice());
        System.out.println("Одежда " + denis.getName() + " стоит: " + denis.getPrice());
        System.out.println("Одежда " + vitya.getName() + " стоит: " + vitya.getPrice());
        System.out.println("----------------------------------------------");
        maxim.hope();
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
        maxim.undress();
        System.out.println("----------------------------------------------");
        denis.hope();
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
        denis.undress();
        System.out.println("----------------------------------------------");
        vitya.hope();
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
        vitya.undress();
    }
}
