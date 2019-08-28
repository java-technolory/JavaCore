package mta.edu.vn.demo;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedType;
import java.util.logging.Logger;

@InheritableAnnotation
class Parent {

}

class Child extends Parent {

}

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> clazz = Parent.class;
        Class<?> c = Class.forName("mta.edu.vn.demo.Parent");

        Parent ps = new Parent();
        Class<?> parent = ps.getClass();

        System.out.println(clazz.getName() + " && " + c.getName());
        System.out.println(clazz.getSimpleName() + " && " + c.getSimpleName());
        System.out.println(clazz.getCanonicalName() + " && " + c.getCanonicalName());

        Package p = clazz.getPackage();
        System.out.println(p.getName());

        Annotation [] annotations = clazz.getAnnotations();
        for (Annotation a : annotations){
            System.out.println("... = " + a.annotationType().getCanonicalName() + " - " + a.annotationType().getFields());
        }

        Annotation annotation = clazz.getAnnotation(InheritableAnnotation.class);
        InheritableAnnotation hs = (InheritableAnnotation) annotation;
        System.out.println(hs.name());
        System.out.println(hs.address());
        Logger.
    }
}
