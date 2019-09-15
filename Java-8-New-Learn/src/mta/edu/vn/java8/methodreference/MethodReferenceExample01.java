package mta.edu.vn.java8.methodreference;

import java.util.ArrayList;
import java.util.List;

interface A {
    default void print(){
        System.out.println("Hello world");
    }
}

public class MethodReferenceExample01 implements A {
    public static void main(String[] args) {

        A a = new MethodReferenceExample01();
        a.print();

        List names = new ArrayList();

        names.add("Phan");
        names.add("Van");
        names.add("Hai");
        names.add("Thi");
        names.add("Mai");
        names.add("Tuan");

        names.forEach(System.out::println);
        names.forEach(e -> System.out.print(e + " "));
    }
}
