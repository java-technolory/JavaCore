package mta.edu.vn.example;

public class TestStatic {
    public static void main(String[] args) {
        StaticExample.setCount(5);

        //non-private static variables can be accessed with class name
        StaticExample.str = "abc";
        StaticExample se = new StaticExample();
        System.err.println(se.getCount());

        //Class and instance static variables are same
        System.err.println(StaticExample.str + " is same as " + se.str);
        System.err.println(StaticExample.str == se.str);

        //Static nested classes are like normal top-level classes
        StaticExample.MyStaticClass myStaticClass = new StaticExample.MyStaticClass();
        myStaticClass.count = 10;

        StaticExample.MyStaticClass myStaticClass1 = new StaticExample.MyStaticClass();
        myStaticClass.count = 20;

        System.err.println(myStaticClass.count);
        System.err.println(myStaticClass.count);
    }
}
