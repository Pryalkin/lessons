package lesson2.rocketLaunch;

public class Run {
    public static void main(String[] args) {
        IStart shuttle = new Shuttle();
        IStart spaceX = new SpaceX();
        Spaceport spaceport = new Spaceport();
        spaceport.launch(shuttle);
        spaceport.launch(spaceX);
    }
}
