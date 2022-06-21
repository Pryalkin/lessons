package lesson2.printable;

public class Magazine implements Printable{

    private String name;

    public Magazine(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("Печатаю " + name);
    }

    public static void printMagazines(Printable[] printables){
        for (Printable printable: printables) {
            if (printable instanceof Magazine){
                System.out.println(((Magazine) printable).name);
            }
        }
    }
}
