package lesson1.phone;

public class Phone implements Comparable<Phone>{

    private String number;
    private String model;
    private double weight;

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this(number, model, 0);
    }

    public Phone() {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getNumber(){
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void receiveCall(String name){
        System.out.println("Звонит: " + name);
    }

    public void receiveCall(String number, String name){
        System.out.println("Звонит: " + name);
        System.out.println("Его номер: " + number);
    }

    public void sendMessage(String... numbers){
        for (String number : numbers){
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

    @Override
    public int compareTo(Phone p) {
        return number.compareTo(p.number);
    }
}
