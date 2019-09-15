package mta.edu.vn.annotations;

import java.lang.annotation.*;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(RepeatableAnnotaion1.class)
public @interface RepeatableAnnotaion2 {

    String value();
}

