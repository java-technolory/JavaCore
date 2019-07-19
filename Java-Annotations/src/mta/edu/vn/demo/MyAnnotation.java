package mta.edu.vn.demo;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Inherited
public @interface MyAnnotation {
    String table();
    String schemas();
}
