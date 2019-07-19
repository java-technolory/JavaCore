package com.mta.edu.test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Main {

    public static void main(String [] args) throws ClassNotFoundException {
//        final Method [] methods = aString.class.getMethods();
        String s = new String();
        Method [] methods = s.getClass().getMethods();
        Class c = String.class;
        System.err.println(Arrays.toString(c.getClass().getMethods()) );
        for (final Method m : methods){
            System.out.println(m.getName());
        }

        final Field [] fields = String.class.getFields();
        for (final Field f : fields){
            System.err.println(f.getName());
        }
    }
}
