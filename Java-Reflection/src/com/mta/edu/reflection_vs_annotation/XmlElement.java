package com.mta.edu.reflection_vs_annotation;

import java.lang.annotation.*;

/**
 * XmlElementWrapper
 * - Sử dụng để đánh dấu đây là một phần của tài liệu xml
 */

@Documented
@Target(ElementType.FIELD)
@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface XmlElement {

    String name();

}
