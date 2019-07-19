package com.mta.edu.reflection_vs_annotation;

import java.lang.annotation.*;

/**
 * XmlRootElement
 * - Sử dụng để đánh dấu phần tử gốc (root element) của một tài liệu xml
 */

@Documented
@Target(ElementType.TYPE)
@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface XmlRootElement {

    String name();

    String namespace() default "";

}
