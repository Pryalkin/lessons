package lessons3.human;

import lessons3.human.jacket.IJacket;
import lessons3.human.pants.IPants;
import lessons3.human.shoes.IShoes;

public class Human implements IHuman{

    private String name;
    private IJacket iJacket;
    private IPants iPants;
    private IShoes iShoes;

    public Human(String name, IJacket iJacket, IPants iPants, IShoes iShoes) {
        this.name = name;
        this.iJacket = iJacket;
        this.iPants = iPants;
        this.iShoes = iShoes;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void hope() {
        iJacket.putOn();
        iPants.putOn();
        iShoes.putOn();
    }

    @Override
    public void undress() {
        iJacket.takeOff();
        iPants.takeOff();
        iShoes.takeOff();
    }

    @Override
    public int getPrice() {
        return iJacket.getPrice() + iPants.getPrice() + iShoes.getPrice();
    }
}
