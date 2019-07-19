package com.mta.edu.example;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class ReflectFieldExample {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {

        // Lấy ra đối tượng Class mô tả class Cat
        Class<?> aClazz = Cat.class;

        // Lấy ra danh sách các field public
        // Kể cả các public field thừa kế từ các class cha, và các interface
        System.out.println("\nField: ");
        Field[] fields = aClazz.getFields();
        for (Field field : fields){
            System.out.println(" + " + field.getName());
        }

        // Lấy ra field có tên 'NUMBER_OF_LEGS'
        Field field  = aClazz.getField("NUMBER_OF_LEGS");
        System.out.println("\n" + field.getName());

        // Ghi ra kiểu của Field
        Class<?> fieldType = field.getType();
        System.out.println("Field type : " + fieldType.getSimpleName());

        // Khởi tạo đối tượng Cat
        Cat cat = new Cat("Tom",1);

        // Lấy ra giá trị của trường "age" theo cách Reflect

        Field field1 = aClazz.getDeclaredField("age");
        field1.setAccessible(true);
        Integer age = (Integer) field1.get(cat);
        System.out.println("Age = " + age);

        // Gán giá trị mới cho trường age
        field1.set(cat,2);
        System.out.println("New Age = " + cat.getAge());

        // Lấy danh sách các Annotaion cùa Field
        System.out.println("\nAnnotaion: ");
        Annotation [] annotations = field1.getAnnotations();
        for (Annotation annotation : annotations){
            System.out.println(" + " + annotation.annotationType().getSimpleName());
        }


    }
}
