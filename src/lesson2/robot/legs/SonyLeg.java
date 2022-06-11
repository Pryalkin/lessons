package lesson2.robot.legs;

public class SonyLeg implements ILeg{

    private int price;

    public SonyLeg(int price) {
        this.price = price;
    }

    @Override
    public void step() {
        System.out.println("Говорит ноги Sony");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
