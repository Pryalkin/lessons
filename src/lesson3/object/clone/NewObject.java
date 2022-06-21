package lesson3.object.clone;

public class NewObject implements Cloneable{
    private int j;

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }

    @Override
    protected NewObject clone() throws CloneNotSupportedException {
        return (NewObject) super.clone();
    }
}
