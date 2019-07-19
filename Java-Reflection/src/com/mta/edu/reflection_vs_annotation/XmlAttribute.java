package com.mta.edu.reflection_vs_annotation;

import java.lang.annotation.*;

/**
 * XmlElementWrapper
 * - Sử dụng để đánh dấu đây là một thuộc tính của phần tử
 */

@Documented
@Target(ElementType.FIELD)
@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface XmlAttribute {

    String name();

}
