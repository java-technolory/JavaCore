package mta.edu.vn.gennerics.classs;

import java.util.List;

public class GenericHeritance {

    public static void main(String [] args){
        String str = "abc";
        Object obj = new Object();
        obj = str;  // works because String is-a Object, inheritance in java
        MyClass<String> myClass1 = new MyClass<String>();
        MyClass<Object> myClass2 = new MyClass<Object>();
        obj = myClass1;
        obj = myClass1;

    }

//    public static class MyClass<T>{
//
//    }

}

class MyClass<T>{

}

interface MyList<E,T> extends List<E>{

}