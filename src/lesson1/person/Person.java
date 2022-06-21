package lesson1.person;

public class Person {

    private String fullName;
    private int age;

    public Person() {
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void move(){
        System.out.println(fullName + " говорит, что ему " + age + " лет.");
    }

    public void talk(){
        System.out.println(fullName + " говорит, что ему " + age + " лет.");
    }
}
