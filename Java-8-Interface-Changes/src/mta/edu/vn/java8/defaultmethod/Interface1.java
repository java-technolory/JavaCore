package mta.edu.vn.java8.defaultmethod;

public interface Interface1 {

    void method1(String str);

    default void log(String str) {
        System.err.println("Interface1 logging::" + str);
    }
}
