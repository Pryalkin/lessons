package lesson1.array;

import java.util.Arrays;

public class ArrayList {

    private Integer [] array;
    private Integer capacity;

    public ArrayList() {
        capacity = 16;
        array = new Integer[capacity];
    }

    public Integer[] sort(){
        Integer [] newArray = new Integer[size()];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = array[i];
        }
        for (int i = 0; i < newArray.length; i++) {
            if((i+1) != newArray.length && newArray[i]>newArray[i+1]){
                Integer thirdPartyVariable;
                thirdPartyVariable = newArray[i];
                newArray[i] = newArray[i+1];
                newArray[i+1] = thirdPartyVariable;
                i=-1;
            }
        }
        array = new Integer[capacity];
        for (int i = 0; i < array.length; i++) {
            if (i < newArray.length) {
                array[i] = newArray[i];
            }
        }
        return array;
    }

    public boolean add(int newElement){
        for (int i = 0; i < array.length; i++) {
            if (i < capacity*0.75-1) {
                if (array[i] == null) {
                    array[i] = newElement;
                    return true;
                }
            } else {
                Integer [] copyArray = createCopyArray();
                capacity *=2;
                array = new Integer[capacity];
                for (int j = 0; j < copyArray.length; j++) {
                    array[j] = copyArray[j];
                }
                i--;
            }
        }
        return false;
    }

    private Integer [] createCopyArray() {
        Integer [] copyArray =  new Integer[capacity];
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
        if (array.length-1 > index){
            Integer [] newArray = new Integer[array.length];
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
        Integer [] newArray = new Integer[j];
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
