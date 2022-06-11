package lesson2.rocketLaunch;

public class Spaceport {

    public void launch(IStart iStart){
        if (iStart.preLaunchSystemCheck()){
            iStart.engineStart();
            for (int i = 0; i < 11; i++) {
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            iStart.start();
        } else System.out.println("Предстартовая проверка провалена!");
    }
}
