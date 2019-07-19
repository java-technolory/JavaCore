package com.mta.edu.example;

import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        getClassInfo();
    }

    public static void getClassInfo() throws ClassNotFoundException{
//        Class<?> aClazz = Class.forName("com.mta.edu.example.Cat");
        Class<?> aClazz = Cat.class;
        System.out.println("Name : " + aClazz.getName());
        System.out.println("Simple Name : " + aClazz.getSimpleName());

        Package pkg = aClazz.getPackage();
        System.out.println("Package Name = " + pkg.getName());


        // Modifier
        int modifiers = aClazz.getModifiers();
        boolean isPublic = Modifier.isPublic(modifiers);
        boolean isInterface = Modifier.isInterface(modifiers);
        boolean isAbstract = Modifier.isAbstract(modifiers);
        boolean isFinal = Modifier.isFinal(modifiers);

        System.out.println("Is Public? " + isPublic);
        System.out.println("Is Final? " + isFinal);
        System.out.println("Is Interface? " + isInterface);
        System.out.println("Is Abstract? " + isAbstract);

        // Lấy ra đối tượng class mô tả class cha của class Cat
        Class<?> aSupperClass = aClazz.getSuperclass();
        System.out.println("Simple Class Name of Super Class = " + aSupperClass.getSimpleName());

        // Lấy ra mảng các Class mô tả các Interface mà Cat thực thi
        System.out.println("\nInterface : ");
        Class<?>[] itfClass = aClazz.getInterfaces();
        for (Class<?> ift : itfClass) {
            System.out.println(" + " + ift.getSimpleName());
        }

        // Lấy danh sách các Constructor của Cat
        System.out.println("\nConstructor : ");
        Constructor<?>[] constructors = aClazz.getConstructors();
        for (Constructor<?> constructor : constructors) {
            Class<?>[] parameterType = constructor.getParameterTypes();
            System.out.println(" + " + constructor.getName() + " has " + constructor.getParameterCount() + " param");
            for (Class pa : parameterType){
                System.out.println("  + " + pa);
            }
            System.out.println("");
        }


        // Lấy ra danh sách các method public của Cat
        // Bao gồm các method thừa kế từ class cha và các interface
        System.out.println("\nDeclared Method: ");
        Method[] methods = aClazz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(" + " + method.getName());
        }

        // Lấy ra danh sách các field public
        // Kể cả các public field thừa kế từ class cha, và các interface
        System.out.println("\nField Public : ");
        Field[] fields = aClazz.getFields();
        for (Field field : fields) {
            System.out.println(" + " + field.getName());
        }

        // Lấy ra danh sách tất cả các field được khai báo là public, private, protected, ...
        System.out.println("\nField Private : ");
        Field[] fields1 = aClazz.getDeclaredFields();
        for (Field field : fields1){
            System.out.println(" + " + field.getName() + " - " + field.getType().getSimpleName());
        }

        // Lấy ra danh sách các Annotation của class
        System.out.println("\nAnnotation: ");
        Annotation[] annotations = aClazz.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(" + " + annotation.annotationType().getSimpleName());
        }

    }
}
