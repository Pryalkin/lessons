package lesson1.phone;

public class Run {
    public static void main(String[] args) {
        Phone samsung = new Phone("123_23_56", "Samsung", 560);
        Phone sony = new Phone("987_65_43", "Sony", 340);
        Phone philips = new Phone("453_34_33", "Philips", 255);
        System.out.println(samsung);
        System.out.println(sony);
        System.out.println(philips);
        samsung.receiveCall("Pavel");
        System.out.println(samsung.getNumber());
        samsung.receiveCall("324_34_23", "Ivan");
        samsung.sendMessage("134_54_54", "321_33_21", "543_12_23");
    }
}
