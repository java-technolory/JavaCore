package mta.edu.vn.java8.defaultmethod;

public interface Interface2 {

    void method2();

    default void log(String str) {
        System.err.println("Interface2 loggin::" + str);
    }
}
