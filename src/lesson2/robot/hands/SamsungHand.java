package lesson2.robot.hands;

public class SamsungHand implements IHand{

    private int price;

    public SamsungHand(int price) {
        this.price = price;
    }

    @Override
    public void upHand() {
        System.out.println("Говорит тело Samsung");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
