package mta.edu.vn.annotations;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface InheritableAnnotaion {

}

@InheritableAnnotaion
interface A {
    public void getA();
}


class B implements A {

    @Override
    public void getA() {

    }
}

class C extends B {

}


class Parent implements InheritableAnnotaion{

    @Override
    public Class<? extends Annotation> annotationType() {
        return null;
    }
}

class Child extends Parent {

}


