package com.mta.edu.reflection_vs_annotation;

import java.lang.annotation.*;

/**
 * XmlElementWrapper
 * - Sử dụng để đánh dấu đây là một phần cha và giá trị của nó à một collection (chứa tài liệu xml con)
 */

@Documented
@Target(ElementType.FIELD)
@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface XmlElementWrapper {

    String name();

}
