package com.mta.edu.example;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AccessPrivateMethodExample {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        // Tạo một đối tượng Class mô tả class Cat
        Class<Cat> aClazz = Cat.class;

        // Class.getMethod(String) chỉ lấy được các method public.
        // Sử dụng Class.getDeclaredMethod(String): Lấy đối tượng Method mô tả method setName(String) của Class Cat.
        Method private_setNameMethod = aClazz.getDeclaredMethod("setName", String.class);

        // Cho phép truy cập vào các method private
        // Nếu không sẽ sinh ra ngoại lệ IllegalAccessException
        private_setNameMethod.setAccessible(true);

        Cat tom = new Cat("Tom");
        System.out.println("Name = " + tom.getName());

        // Gọi private method.
        private_setNameMethod.invoke(tom,"Hai");
        System.out.println("New value = " + tom.getName());

    }

}
