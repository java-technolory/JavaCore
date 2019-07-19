package com.mta.edu.example;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class ParameterAnnotationExample {

    // Ví dụ một method có Annotation ở tham số
    protected void doSomeThing(int jobType, @MyAnnotaion(name = "Table", value = "Employee") String info){

    }

    public static void main(String[] args) throws NoSuchMethodException {

        // Lấy đối tượng Class
        Class<?> aClazz = ParameterAnnotationExample.class;

        // Lấy đối tượng Method của method doSomething(int,String)
        Method method = aClazz.getDeclaredMethod("doSomeThing", int.class, String.class);

        // Lấy danh sách các Parameter của method
        Class<?>[] parameterType = method.getParameterTypes();
        for (Class<?> paraType : parameterType){
            System.out.println("Parameter Type : " + paraType.getSimpleName());
        }

        System.out.println(" ================================================ ");

        // Lấy ra mảng 2 chiều các Annotation trong các Paramter
        Annotation[][] annotations = method.getParameterAnnotations();

        // Lấy ra danh sách các Annotation của Parameter tại vị trí Index = 1
        Annotation[] annotations1 = annotations[1];

        for (Annotation annotation : annotations1){
            System.out.println("Annotation : " + annotation.annotationType().getSimpleName());
        }

    }
}
