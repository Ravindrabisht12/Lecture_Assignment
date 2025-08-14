package org.LLD1.Generics;


/**
 * This is an example Generic class
 * K, V are params we can name it anything like Ram, Shyam etc
 * @param <K>
 * @param <V>
 */
public class PairGenerics<K, V>{
    private K first;
    private V second;

    public PairGenerics(K first, V second){
        this.first = first;
        this.second = second;
    }

    public void setFirst(K first) {
        this.first = first;
    }

    public void setSecond(V second) {
        this.second = second;
    }

    public K getFirst() {
        return first;
    }

    public V getSecond() {
        return second;
    }
}
