package lesson3.list;

public interface List<T> {

//    Object[] sort();
    boolean add(T newElement);
    Integer size();
    boolean remove(int index);
    <T> Object[] toArray();
}
