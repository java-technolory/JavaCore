package com.mta.edu.example;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectConstructorExample {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        // Lấy ra đối tượng Class mô tả class Cat
        Class<Cat> aClass = Cat.class;

        // Lấy ra Constructor không đối số.
        Cat cat1 = aClass.getConstructor(null).newInstance(null);
        System.out.println(cat1.getName() + " :: " + cat1.getAge());

        // Lấy ra Constructor tham số (String, int) của class Cat
        Constructor<?> constructor = aClass.getConstructor(String.class, int.class);

        // Lấy ra thông tin kiểu tham số của Constructor
        System.out.println("Params: ");
        Class<?>[] paramClasses = constructor.getParameterTypes();
        for (Class<?> paramClass : paramClasses) {
            System.out.println(" + " + paramClass.getSimpleName());
        }

        // Khởi tạo đối tượng Cat theo cách thông thường.
        Cat tom = new Cat("Tom", 1);
        System.out.println("Cat 1: " + tom.getName() + ", age = " + tom.getAge());

        // Khởi tạo đối tượng Cat theo cách của reflect
        Cat tom2 = (Cat) constructor.newInstance("Tome", 2);
        System.out.println("Cat 2: " + tom2.getName() + ", age = " + tom2.getAge());
    }

}
