package mta.edu.vn.demo;

import java.lang.annotation.*;

@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface Tables {
    String name() default "";
    String schemas() default "";
}
