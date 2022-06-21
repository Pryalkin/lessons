package lesson3.object.clone;

public class MyObject implements Cloneable{
    private int i;
    private NewObject newObject;

    public NewObject getNewObject() {
        return newObject;
    }

    public void setNewObject(NewObject newObject) {
        this.newObject = newObject;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    @Override
    protected MyObject clone() throws CloneNotSupportedException {
        MyObject myObject = (MyObject) super.clone();
        myObject.newObject = newObject.clone();
        return myObject;
    }
}
