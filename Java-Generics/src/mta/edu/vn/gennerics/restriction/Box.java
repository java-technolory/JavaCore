package mta.edu.vn.gennerics.restriction;

public class Box<T> {

    // compiler error.
//    private static T ts;

    private T t;

    public void add(T t) {
        this.t = t;
    }

    public T get() {
        return this.t;
    }
}
