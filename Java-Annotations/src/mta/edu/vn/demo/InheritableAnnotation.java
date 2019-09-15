package mta.edu.vn.demo;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD,ElementType.METHOD,ElementType.TYPE})
@Inherited
public @interface InheritableAnnotation {
    String name() default "Phan Hai";
    String address() default  "Ha Noi";
}



