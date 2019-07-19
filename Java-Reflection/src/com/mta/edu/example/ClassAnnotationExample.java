package com.mta.edu.example;

import java.lang.annotation.Annotation;

@MyAnnotaion(name = "Table", value = "Employee")
public class ClassAnnotationExample {

    public static void main(String[] args) {
        Class<?> aClazz = ClassAnnotationExample.class;

        // Lấy danh sách các Annotaion của class.
        Annotation[] annotations = aClazz.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println("Annotaion : " + annotation.annotationType().getSimpleName());
        }

        // Hoặc lấy cụ thể.
        Annotation ann = aClazz.getAnnotation(MyAnnotaion.class);
        MyAnnotaion myAnnotaion = (MyAnnotaion) ann;
        System.out.println("Name = " + myAnnotaion.name());
        System.out.println("Value = " + myAnnotaion.value());
    }

}
