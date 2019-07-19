package mta.edu.vn.ann;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Use case:
 * - chỉ sử dụng chú thích cho class, và tên class phải có hậu tố Controller.
 */

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.SOURCE)
public @interface Controller {

}
