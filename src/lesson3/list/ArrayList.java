package lesson3.list;

import java.util.Arrays;

public class ArrayList<T> implements List<T> {

    private Object[] array;
    private int capacity;

    public ArrayList() {
        capacity = 16;
        array = new Object[capacity];
    }

    public Object[] sort(){
        Object[] newArray = new Object[size()];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = array[i];
        }
        for (int i = 0; i < newArray.length; i++) {
            if((i+1) != newArray.length){
                if (methodForComparingValues(newArray[i], newArray[i+1])) {
                    Object thirdPartyVariable;
                    thirdPartyVariable = newArray[i];
                    newArray[i] = newArray[i + 1];
                    newArray[i + 1] = thirdPartyVariable;
                    i = -1;
                }
            }
        }
        array = new Object[capacity];
        for (int i = 0; i < array.length; i++) {
            if (i < newArray.length) {
                array[i] = newArray[i];
            }
        }
        return array;
    }

    public Object[] toArray(){
        Object[] newArray = new Object[size()];
        for (int i = 0; i < newArray.length; i++) {
            if (array[i] != null){
                newArray[i] = array;
            } else break;
        }
        return newArray;
    }

    private boolean methodForComparingValues(Object o, Object o1) {
        if (o instanceof Integer && o1 instanceof Integer){
            if (((Integer) o).intValue() > ((Integer) o1).intValue()){
                return true;
            } else return false;
        }
        if (o instanceof Double && o1 instanceof Double){
            if (((Double) o).intValue() > ((Double) o1).intValue()){
                return true;
            } else return false;
        }
        if (o instanceof String && o1 instanceof String){
            if (((String) o).compareTo((String) o1) > 0){
                return true;
            } else return false;
        }
        return false;
    }

    public boolean add(T newElement){
        for (int i = 0; i < array.length; i++) {
            if (i < capacity*0.75-1) {
                if (array[i] == null) {
                    array[i] = newElement;
                    return true;
                }
            } else {
                Object [] copyArray = createCopyArray();
                capacity *=2;
                array = new Object[capacity];
                for (int j = 0; j < copyArray.length; j++) {
                    array[j] = copyArray[j];
                }
                i--;
            }
        }
        return false;
    }

    private Object[] createCopyArray() {
        Object[] copyArray =  new Object[capacity];
        for (int j = 0; j < array.length; j++) {
            copyArray[j] = array[j];
        }
        return copyArray;
    }

    public Integer size(){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null){
                return i;
            }
        }
        return null;
    }

    public boolean remove(int index){
        if (index > size()-1 || index < 0){
            try {
                throw new MyException("Индекс не соответсвует массиву");
            } catch (MyException e) {
                e.printStackTrace();
            }
        } else {
            Object [] newArray = new Object[array.length];
            int j = 0;
            for (int i = 0; i < array.length; i++) {
                if (i == index){
                    continue;
                } else {
                    if (array[i] == null) {
                        for (int k = 0; k < newArray.length; k++) {
                            array[k] = newArray[k];
                        }
                        return true;
                    } else {
                        newArray[j] = array[i];
                        j++;
                    }
                }
            }
        }
        return false;
    }

    private String getArray(){
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                j = i;
                break;
            }
        }
        Object [] newArray = new Object[j];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = array[i];
        }
        return Arrays.toString(newArray);
    }

    @Override
    public String toString() {
        return "ArrayList{" +
                "array=" + getArray() +
                '}';
    }

}
