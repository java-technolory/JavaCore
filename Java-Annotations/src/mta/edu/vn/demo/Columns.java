package mta.edu.vn.demo;

import java.lang.annotation.*;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({METHOD, FIELD})
@Inherited
public @interface Columns {
    String name() default "";
}
