package lesson2.animal;

public class Dog extends Animal{

    public Dog(String nickname, String sound) {
        super(nickname, sound);
    }

    @Override
    public void makeNoise() {
        System.out.println(getNickname() + " делает " + getSound());
    }

    @Override
    public void eat() {
        System.out.println(getNickname() + " есть");
    }
}
