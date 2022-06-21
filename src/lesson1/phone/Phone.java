package lesson1.phone;

public class Phone {

    private int number;
    private String model;
    private double weight;

    public Phone(int number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(int number, String model) {
        this(number, model, 0);
    }

    public Phone() {
    }

    public int getNumber(){
        return number;
    }

    public void receiveCall(String name){
        System.out.println("Звонит: " + name);
    }

    public void receiveCall(int number, String name){
        System.out.println("Звонит: " + name);
        System.out.println("Его номер: " + number);
    }

    public void sendMessage(int... numbers){
        for (int number : numbers){
            System.out.println("Сообщение отправленно номеру: " + number);
        }
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number=" + number +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }
}
