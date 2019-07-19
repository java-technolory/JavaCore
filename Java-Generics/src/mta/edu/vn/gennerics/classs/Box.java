package mta.edu.vn.gennerics.classs;

public class Box<T> {
    private T t;

    public Box() {
    }

    public T get() {
        return t;
    }

    public void add(T t) {
        this.t = t;
    }
}
