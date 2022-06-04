package lessons3.robot;

import lessons3.robot.hands.SamsungHand;
import lessons3.robot.hands.SonyHand;
import lessons3.robot.hands.ToshibaHand;
import lessons3.robot.heads.SamsungHead;
import lessons3.robot.heads.SonyHead;
import lessons3.robot.heads.ToshibaHead;
import lessons3.robot.legs.SamsungLeg;
import lessons3.robot.legs.SonyLeg;

public class Run {
    public static void main(String[] args) {
        /*
        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
        Класс SonyHead является примером реализацией головы от Sony.
        Создайте 3 робота с разными комплектующими.
        Например у робота голова и нога от Sony а, рука от Samsung.
        У всех роботов вызовите метод action.
        Среди 3-х роботов найдите самого дорогого.
        */
        IRobot maxim = new Robot(new SonyHead(32), new SamsungHand(47), new SamsungLeg(23));
        IRobot denis = new Robot(new SamsungHead(31), new SonyHand(41), new SamsungLeg(29));
        IRobot spartak = new Robot(new ToshibaHead(35), new ToshibaHand(37), new SonyLeg(17));
        System.out.println("Робот maxim стоит: " + maxim.getPrice());
        System.out.println("Робот denis стоит: " + denis.getPrice());
        System.out.println("Робот spartak стоит: " + spartak.getPrice());
        System.out.println("----------------------------------------------");
        maxim.action();
        System.out.println("----------------------------------------------");
        denis.action();
        System.out.println("----------------------------------------------");
        spartak.action();
        System.out.println("----------------------------------------------");
    }
}
