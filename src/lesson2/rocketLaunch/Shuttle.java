package lesson2.rocketLaunch;

public class Shuttle implements IStart{

    @Override
    public boolean preLaunchSystemCheck() {
        int random_number = (int) (Math.random() * 10);
        if (random_number > 3) return true;
        else return false;
    }

    @Override
    public void engineStart() {
        System.out.println("Двигатели Shuttle запущены. Все системы в норме.");
    }

    @Override
    public void start() {
        System.out.println("Старт Shuttle.");
    }
}
