package mta.edu.vn.annotations;

import java.lang.annotation.Annotation;

public class SimpleAnnotation implements SimpleAnnotationWithValue {
    @Override
    public String value() {
        return null;
    }

    @Override
    public Class<? extends Annotation> annotationType() {
        return null;
    }

    @RepeatableAnnotaion2("repeatable 1")
    @RepeatableAnnotaion2("repeatable 2")
    public void performAction() {

    }
}
