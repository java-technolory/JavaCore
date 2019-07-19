package com.mta.edu.reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, InstantiationException {
        // Get class using reflection
        Class<?> concreteClass = ConcreteClass.class;

        try {

            // Below method is used most of the time in framework like JUnit
            // Spring dependency injection, Tomcat web container
            // Eclipse auto completion is not available at compile time

            concreteClass = Class.forName("com.mta.edu.reflection.ConcreteClass");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println(concreteClass.getCanonicalName());

        // for primitive types, wrapper classes and arrays
        Class<?> booleanClass = boolean.class;
        System.out.println(booleanClass.getCanonicalName());    // prints boolean

        Class<?> cDouble = Double.TYPE;
        System.out.println(cDouble.getCanonicalName());     // prints double

        Class<?> cDoubleArray = Class.forName("[D");
        System.out.println(cDoubleArray.getCanonicalName());    // prints double[]

        Class<?> twoDStringArray = String[][].class;
        System.out.println(twoDStringArray.getCanonicalName());     // print java.lang.String[][]

        // Get Super Class
        System.out.println("\n=================================================================================");
        System.out.println("=========================/// Get Super Class /// ================================");
        System.out.println("=================================================================================\n");
        Class<?> superClass = Class.forName("com.mta.edu.reflection.ConcreteClass").getSuperclass();
        System.out.println(superClass);     // prints "com.mta.edu.reflection.BaseClass"
        System.out.println(Object.class.getSuperclass());   // prints "null"
        System.out.println(String[][].class.getSuperclass());   // prints "java.lang.Object"


        // Get Public Member Classes
        System.out.println("\n=================================================================================");
        System.out.println("=====================/// Get Public Member Classes /// ==========================");
        System.out.println("=================================================================================\n");
        Class<?>[] classes = concreteClass.getClasses();
        System.out.println(Arrays.toString(classes));

        // Get Declared Classes
        System.out.println("\n=================================================================================");
        System.out.println("=======================/// Get Declared Classes /// ============================");
        System.out.println("=================================================================================\n");

        // getting all of the classes, interfaces, and enums that are explicitly declared in ConcreteClass
        Class<?>[] explicitClasses = Class.forName("com.mta.edu.reflection.ConcreteClass").getDeclaredClasses();
        System.out.println(Arrays.toString(explicitClasses));

        // getDeclaringClass(): method trả về đối tượng class đại diện cho lớp mà nó được khai báo.
        Class<?> innerClass = Class.forName("com.mta.edu.reflection.ConcreteClass$ConcreteClassDefaultClass");
        System.out.println(innerClass.getDeclaringClass().getCanonicalName());
        System.out.println(innerClass.getEnclosingClass().getCanonicalName());

        // Get Class Modifiers
        System.out.println("\n=================================================================================");
        System.out.println("=======================/// Get Class Modifiers /// ============================");
        System.out.println("=================================================================================\n");

        System.out.println(Modifier.toString(concreteClass.getModifiers()));
        System.out.println(Modifier.toString(Class.forName("com.mta.edu.reflection.BaseInterface").getModifiers()));

        // Get Type Parameters
        System.out.println("\n=================================================================================");
        System.out.println("=======================/// Get Type Parameters /// ============================");
        System.out.println("=================================================================================\n");

        TypeVariable<?>[] typeVariables = Class.forName("java.util.HashMap").getTypeParameters();
        for (TypeVariable<?> t : typeVariables) {
            System.out.println(t.getName() + ",");
        }


        // Get Implemented Interfaces
        System.out.println("\n=================================================================================");
        System.out.println("=====================/// Get Implemented Interfaces /// ========================");
        System.out.println("=================================================================================\n");
        Type[] interfaces = Class.forName("java.util.HashMap").getGenericInterfaces();
        System.out.println(Arrays.toString(interfaces));
        System.out.println(Arrays.toString(Class.forName("java.util.HashMap").getInterfaces()));

        // Get All Public Method
        System.out.println("\n=================================================================================");
        System.out.println("=====================/// Get All Public Method /// ========================");
        System.out.println("=================================================================================\n");

        // prints public method of ConcreteClass, BaseClass, Object.
        Method[] publicMethod = Class.forName("com.mta.edu.reflection.ConcreteClass").getMethods();
        System.out.println(Arrays.toString(publicMethod));

        // Get All Public Constructor
        System.out.println("\n=================================================================================");
        System.out.println("=====================/// Get All Public Constructor /// ========================");
        System.out.println("=================================================================================\n");

        Constructor<?>[] publicConstructor = Class.forName("com.mta.edu.reflection.ConcreteClass").getConstructors();
        // prints public constructors of ConcreteClass
        System.out.println(Arrays.toString(publicConstructor));

        // Get All Public Fields
        System.out.println("\n=================================================================================");
        System.out.println("=====================/// Get All Public Fields /// ========================");
        System.out.println("=================================================================================\n");
        Field[] publicField = Class.forName("com.mta.edu.reflection.ConcreteClass").getFields();
        System.out.println(Arrays.toString(publicField));

        // Get All Annotations
        System.out.println("\n=================================================================================");
        System.out.println("=====================/// Get All Annotation /// ========================");
        System.out.println("=================================================================================\n");
        Annotation[] annotations = Class.forName("com.mta.edu.reflection.ConcreteClass").getAnnotations();
        System.out.println(Arrays.toString(annotations));


        // Get Public Field
        System.out.println("\n=================================================================================");
        System.out.println("=====================/// Get Public Field /// ========================");
        System.out.println("=================================================================================\n");
        Field field = Class.forName("com.mta.edu.reflection.ConcreteClass").getField("publicInt");
        System.out.println(field);


        // Field Declaring Class (class khai báo field đó)
        System.out.println("\n=================================================================================");
        System.out.println("=====================/// Field Declaring Class /// ========================");
        System.out.println("=================================================================================\n");
        Class<?> fieldClass = field.getDeclaringClass();
        System.out.println(fieldClass.getCanonicalName());


        // Get Field Type
        System.out.println("\n=================================================================================");
        System.out.println("=====================/// Get Field Type /// ========================");
        System.out.println("=================================================================================\n");
        Class<?> fieldType = field.getType();
        System.out.println(fieldType.getCanonicalName());


        // Get/Set Public Field Value
        System.out.println("\n=================================================================================");
        System.out.println("=====================/// Get/Set Public Field Value /// ========================");
        System.out.println("=================================================================================\n");
        ConcreteClass obj = new ConcreteClass(5);
        System.out.println(field.get(obj));
        field.set(obj, 10);
        System.out.println(field.get(obj));


        // Get/Set Private Field Value
        System.out.println("\n=================================================================================");
        System.out.println("=====================/// Get/Set Private Field Value /// ========================");
        System.out.println("=================================================================================\n");

        Field privateField = Class.forName("com.mta.edu.reflection.ConcreteClass").getDeclaredField("privateString");

        // turning off access check with below method call
        privateField.setAccessible(true);
        ConcreteClass objTest = new ConcreteClass("Phan");
        System.out.println(privateField.get(objTest));
        privateField.set(objTest, "Private String Updated!");
        System.out.println(privateField.get(objTest));


        // Get Public Method
        System.out.println("\n=================================================================================");
        System.out.println("=====================/// Get Public Method /// ========================");
        System.out.println("=================================================================================\n");
        Method method = Class.forName("java.util.HashMap").getMethod("put", Object.class, Object.class);
        System.out.println(Arrays.toString(method.getParameterTypes()));
        System.out.println(method.getReturnType());
        System.out.println(Modifier.toString(method.getModifiers()));


        // Invoking Public Method
        System.out.println("\n=================================================================================");
        System.out.println("=====================/// Invoking Public Method /// ========================");
        System.out.println("=================================================================================\n");
        Map<String, String> hm = new HashMap<>();
        method.invoke(hm, "key", "value");
        System.out.println(hm);


        // Invoking Private Methods
        System.out.println("\n=================================================================================");
        System.out.println("=====================/// Invoking Public Method /// ========================");
        System.out.println("=================================================================================\n");
        Method methods = Class.forName("com.mta.edu.reflection.BaseClass").getDeclaredMethod("method3", null);
        methods.setAccessible(true);
        methods.invoke(null, null);


        // Get Public Constructor
        Constructor<?> constructor = Class.forName("com.mta.edu.reflection.ConcreteClass").getConstructor(int.class);
        // getting constructor parameters
        System.out.println(Arrays.toString(constructor.getParameterTypes()));

        Constructor<?> hashMapConstructor = Class.forName("java.util.HashMap").getConstructor(null);
        System.out.println(Arrays.toString(hashMapConstructor.getParameterTypes()));

        // Instantiate Object Using Constructor
        System.out.println("///////////////////////////////////");
        Object object = constructor.newInstance(10);
        Method myObjMethod = object.getClass().getMethod("method1", null);
        myObjMethod.invoke(object, null);


    }
}
