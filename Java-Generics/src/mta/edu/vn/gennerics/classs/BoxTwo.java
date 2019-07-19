package mta.edu.vn.gennerics.classs;

public class BoxTwo<T, S> {

    private T t;
    private S s;

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
