package top.xkk.java.basic.generics;

public class MyMap<K,V> {
    private final K key;
    private final V value;
    public MyMap(K key, V value) {
        this.key = key;
        this.value = value;
    }
    @Override
    public String toString() {
        return "MyMap{" + "key=" + key + ", value=" + value + '}';
    }
}