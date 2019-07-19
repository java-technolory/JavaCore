package mta.edu.vn.test;

class E {
    F obj;

    E(F obj) {
        this.obj = obj;
    }

    void display() {
        this.obj.data = 100;
        System.err.println(this.obj.data); // using data member of F class
    }
}

class F {
    int data = 10;

/*
    // no use this
    F() {

    }

    F(int x) {
        E e = new E(new F());
        e.display();
    }
*/

    // use this
    F(){
        E e = new E(this);
        e.display();
    }
}

public interface This_ToPassAsArgumentInTheConstructorAll {
    public static void main(String[] args) {
        F f = new F();
    }
}
