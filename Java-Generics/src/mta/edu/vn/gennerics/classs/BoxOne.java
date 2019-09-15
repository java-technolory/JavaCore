package mta.edu.vn.gennerics.classs;

public class BoxOne<T, S> {

    private T t;
    private S s;

    public BoxOne() {

    }

    public void add(T t, S s) {
        this.t = t;
        this.s = s;
    }

    public T getFirst() {
        return this.t;
    }

    public S getSecond() {
        return this.s;
    }
}
