package mta.edu.vn.java8.staticmethod;

public interface MyData {

    default void print(String str) {
        if (!isNull(str)) {
            System.err.println("MyData Print::" + str);
        }
    }

    default boolean isNull(String str) {
        System.err.println("Interface Null Check");
        return str == null ? true : "".equals(str) ? true : false;
    }

    // not body
    void hello();

}
