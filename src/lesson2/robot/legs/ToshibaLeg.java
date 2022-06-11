package lesson2.robot.legs;

public class ToshibaLeg implements ILeg{

    private int price;

    public ToshibaLeg(int price) {
        this.price = price;
    }

    @Override
    public void step() {
        System.out.println("Говорит ноги Toshiba");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
