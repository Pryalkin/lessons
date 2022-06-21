package lesson2.rocketLaunch;

public class Shuttle implements IStart{

    @Override
    public boolean preLaunchSystemCheck() {
        return (Math.random() * 10) > 3 ? true : false;
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
