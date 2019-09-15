package mta.edu.vn.test;

import mta.edu.vn.demo.Columns;
import mta.edu.vn.demo.Employee;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class AnnotationParsing {
    public static void main(String[] args) throws NoSuchFieldException {

        /*        try {
            for(Method method : AnnotaionParsing.class.getClassLoader().loadClass("mta.edu.vn.test").getMethods()){
                // check if MethodInfo annotation is parsent for the method
                if(method.isAnnotationPresent(mta.edu.vn.test.MethodInfo.class)){
                    for(Annotation anno : method.getDeclaredAnnotations()){
                        System.out.println("Annotation in Method " + method + " : " + anno);
                    }

                    MethodInfo methodInfo = method.getAnnotation(MethodInfo.class);
                    if(method.revision() == 1){

                    }
                }
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }*/

/*        try {
            for (Method method : AnnotationParsing.class.getClassLoader().loadClass("mta.edu.vn.test.AnnotaionExample").getMethods()) {
                // checks if MethodInfo annotation is present for the method
                if (method.isAnnotationPresent(mta.edu.vn.test.MethodInfo.class)) {
                    try {
                        // iterates all the annotations available in the method
                        for (Annotation anno : method.getDeclaredAnnotations()) {
                            System.out.println("Annotation in Method '" + method + "' : " + anno);
                        }
                        MethodInfo methodAnno = method.getAnnotation(MethodInfo.class);
                        if (methodAnno.revision() == 1) {
                            System.out.println("Method with revision no 1 = " + method);
                        }

                    } catch (Throwable ex) {
                        ex.printStackTrace();
                    }
                }
            }
        } catch (SecurityException | ClassNotFoundException e) {
            e.printStackTrace();
        }*/

        System.out.println("///////////////////////////////////////////");

        Class<?> annotation = AnnotaionExample.class;
        Method[] methods = annotation.getDeclaredMethods();
        for (Method m : methods) {
            System.out.println(m.getName());
        }

        try {
            Class<?> aClazz = AnnotationParsing.class;
            Method method = annotation.getDeclaredMethod("oldMethod");
            Method[] method1 = annotation.getDeclaredMethods();
//            MethodInfo methodInfo = MethodInfo.class;
            Annotation[] annotation1 = method.getAnnotations();
            for (Annotation a : annotation1) {
                System.out.println(" + " + a.annotationType().getSimpleName());
            }
            Annotation annotation2 = method.getAnnotation(MethodInfo.class);
            Annotation[] annotation3 = method1.getClass().getAnnotations();
            MethodInfo info = (MethodInfo) annotation2;
            MethodInfo methodInfo = method.getAnnotation(MethodInfo.class);
            System.out.println(info.author() + " - " + info.comments() + " - " + info.date() + " - " + methodInfo.revision());
//            System.out.println(methodInfo.getClass().);

            for (Method m : method1) {
                Method method2 = annotation.getDeclaredMethod(m.getName().toString());
                MethodInfo methodInfo1 = method2.getAnnotation(MethodInfo.class);
                System.out.println(m.getName() + " - " + methodInfo1.author() + " : " + methodInfo1.date() + " : " + methodInfo1.comments());
            }

            for (Annotation a : annotation3) {

                System.out.println(a.annotationType().getSimpleName());
            }
            System.out.println();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        Annotation[] an = methods.getClass().getAnnotations();
        for (Annotation a : an) {
            System.out.println("+ " + a.annotationType().getSimpleName());
        }

        System.out.println("===================================== /// Field /// =================================");
        Class<?> eClazz = Employee.class;
        Field[] field = eClazz.getDeclaredFields();
        Annotation [] annotations = field.getClass().getAnnotations();
        for (Field f : field){
            System.out.println(f.getName() + " - " + f.getType());
            Field field1 = eClazz.getDeclaredField(f.getName());
            Columns columns = field1.getAnnotation(Columns.class);
            System.out.println(" + " + columns.name() + " : ");
        }

        for (Annotation a : annotations){
            System.out.println(" + " + a.annotationType().getSimpleName());

        }
    }

    @MethodInfo(author = "Phan", date = "28/07/1997", revision = 1, comments = "Hihi...")
    private static void text() {

    }

}
