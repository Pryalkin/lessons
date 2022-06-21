package lesson3.generics.threeOptions;

//        1. Создать обобщенный класс с тремя параметрами (T, V, K).
//        2. Класс содержит три переменные типа (T, V, K), конструктор, принимающий на вход параметры типа (T, V, K), методы возвращающие значения трех переменных. Создать метод, выводящий на консоль имена классов для трех переменных класса.
//        3. Наложить ограничения на параметры типа: T должен реализовать интерфейс Comparable (классы оболочки, String), V должен реализовать интерфейс Serializable и расширять класс Animal, K должен расширять класс Number.

public class Test<T, V, K> {
    private T t;
    private V v;
    private K k;

    public Test(T t, V v, K k) {
        this.t = t;
        this.v = v;
        this.k = k;
    }

    public T getT() {
        return t;
    }

    public V getV() {
        return v;
    }

    public K getK() {
        return k;
    }

    /**
     *
     *
     * @return
     */
    public void method(){
        System.out.println(t.getClass().getName());
        System.out.println(v.getClass().getName());
        System.out.println(k.getClass().getName());
    }

}
