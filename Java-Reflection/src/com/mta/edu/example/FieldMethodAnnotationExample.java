package com.mta.edu.example;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class FieldMethodAnnotationExample {

    @MyAnnotaion(name = "My Field")
    private int myField;

    @MyAnnotaion(name = "My Method", value = "My Method Value")
    private void myMethod(String string) {

    }

    public static void main(String[] args) throws NoSuchFieldException, NoSuchMethodException {
        // Lấy đối tượng Class.
        Class<?> aClazz = FieldMethodAnnotationExample.class;

        // Lấy đối tượng Field
        System.out.println(" === FIELD === ");
        Field field = aClazz.getDeclaredField("myField");

        // Lấy ra danh sách các Annotation của Field
        Annotation[] annotations = field.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println("Annotaion : " + annotation.annotationType().getSimpleName());
        }

        // Lấy cụ thể
        Annotation fieldAnn = field.getAnnotation(MyAnnotaion.class);
        MyAnnotaion myAnnotaion = (MyAnnotaion) fieldAnn;
        System.out.println("Name = " + myAnnotaion.name());
        System.out.println("Value = " + myAnnotaion.value());

        // Tương tự với method ...
        System.out.println(" === METHOD ===");
        Method method = aClazz.getDeclaredMethod("myMethod", String.class);
        Annotation[] annotations1 = method.getAnnotations();
        for (Annotation annotation : annotations1) {
            System.out.println("Annotation : " + annotation.annotationType().getSimpleName());
        }

        // Lấy cụ thể
        Annotation methodAnn = method.getAnnotation(MyAnnotaion.class);
        MyAnnotaion myAnnotaion1 = (MyAnnotaion) methodAnn;
        System.out.println("Name = " + myAnnotaion1.name());
        System.out.println("Value = " + myAnnotaion1.value());

    }
}
