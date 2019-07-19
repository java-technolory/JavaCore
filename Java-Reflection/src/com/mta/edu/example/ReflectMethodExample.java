package com.mta.edu.example;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectMethodExample {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        // Lấy ra đối tượng Cat
        Class<Cat> aClass = Cat.class;

        // Lấy ra danh sách các method public của Cat
        // Bao gồm cả các method thừa kế từ class cha và các interface
        System.out.println("Declared Methods : ");
        Method[] methods = aClass.getDeclaredMethods();
        for (Method method : methods){
            System.out.println(" + " + method.getName());
            System.out.println("  - Is Setter? " + isSetter(method));
            System.out.println("  - Is Getter? " + isGetter(method));
        }

        // Lấy đối tượng "Method" mô tả method getAge()
        Method getAgeMethod = aClass.getMethod("getAge");

        // Kiểu trả về của method getAge()
        Class<?> returnType = getAgeMethod.getReturnType();
        System.out.println("Return type of getAge: " + returnType.getSimpleName());

        Cat tom = new Cat("tom",1);

        // Goi method 'getAge' theo cách của Reflect
        int age = (int) getAgeMethod.invoke(tom);
        System.out.println("Age = " + age);

        // Lấy đối tượng 'Method" mô tả method setAge(int) của class Cat.
        Method setAgeMethod = aClass.getMethod("setAge", int.class);

        // Gọi method 'setAge(int)' theo cách của Reflect
        // Nó tương đương với gọi: tom.setAge(2);
        setAgeMethod.invoke(tom,2);
        System.out.println("Age New = " + tom.getAge());

    }

    // Method là getter nếu có tên bắt đầu bằng get, và không có tham số.
    public static boolean isGetter(Method method){
        if(!method.getName().startsWith("get")){
            return false;
        }
        if (method.getParameterTypes().length != 0){
            return false;
        }
        if (void.class.equals(method.getReturnType())) {
            return false;
        }
        return true;
    }

    // Method là setter nếu có tên bắt đầu bằng set, và chỉ có một tham số
    public static boolean isSetter(Method method){
        if (!method.getName().startsWith("set")){
            return false;
        }
        if (method.getParameterTypes().length != 1){
            return false;
        }
        return true;
    }
}
