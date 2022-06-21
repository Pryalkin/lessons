package lesson3.object.clone;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        MyObject myObject = new MyObject();
        myObject.setI(1);
        NewObject newObject = new NewObject();
        newObject.setJ(3);
        myObject.setNewObject(newObject);
        MyObject myObject1 = myObject.clone();
        myObject1.setI(2);
        System.out.println(myObject.getI());
        myObject1.getNewObject().setJ(4);
        System.out.println(myObject.getNewObject().getJ());
    }
}

