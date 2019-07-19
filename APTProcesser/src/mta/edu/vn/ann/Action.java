package mta.edu.vn.ann;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Use case:
 * - chỉ sử dụng chú thích cho method trả về kiểu String.
 */

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.SOURCE)
public @interface Action {

}
