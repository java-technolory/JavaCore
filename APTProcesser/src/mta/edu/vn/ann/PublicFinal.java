package mta.edu.vn.ann;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Use case:
 * - Chỉ sử dụng cho method hoặc field mà có độ truy cập (modifier) là public và final
 */

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.SOURCE)
public @interface PublicFinal {

}
