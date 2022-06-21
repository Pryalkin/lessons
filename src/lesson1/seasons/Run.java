package lesson1.seasons;

public class Run {
    public static void main(String[] args) {
        Season spring = Season.SPRING;
        System.out.println(spring);
        print(spring);
        printAllValues();
    }

    public static void print(Season season){
        switch (season){
            case SPRING:
                System.out.println("I love spring");
                break;
            case AUTUMN:
                System.out.println("I love autumn");
                break;
            case SUMMER:
                System.out.println("I love summer");
                break;
            case WINTER:
                System.out.println("I love winter");
                break;
            default:
                System.out.println("Error");
        }
    }

    public static void printAllValues(){
        for (Season s: Season.values()) {
            System.out.println(s + " " + s.getAverageTemperature() + " " + s.getDescription());
            
        }
    }
}
