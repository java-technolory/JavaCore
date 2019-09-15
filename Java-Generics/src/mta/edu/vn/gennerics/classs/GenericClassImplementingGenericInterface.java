package mta.edu.vn.gennerics.classs;

import mta.edu.vn.gennerics.interfaces.GenericIntefaceOneType;
import mta.edu.vn.gennerics.interfaces.GenericIntefaceSeveralTypes;

public class GenericClassImplementingGenericInterface <T> implements GenericIntefaceOneType<T> {
    @Override
    public void performAction(T action) {
        // Implementation here ...
    }
}

class Test<T> extends GenericClassOneType<T>{
    @Override
    public void performAction(T action) {
        super.performAction(action);
    }
}

class Demo extends GenericClassOneType<String>{
    @Override
    public void performAction(String action) {
        super.performAction(action);
    }
}

class More extends GenericClassOneType{
    @Override
    public void performAction(Object action) {
        super.performAction(action);
    }
}

class Make1<T,R> implements GenericIntefaceSeveralTypes<T,R>{
    @Override
    public R performAction(T action) {
        return null;
    }
}

class Make2 implements GenericIntefaceSeveralTypes{
    @Override
    public Object performAction(Object action) {
        return null;
    }
}

class Make3 implements GenericIntefaceSeveralTypes<String,Integer>{  // types data argument must be wraper type

    @Override
    public Integer performAction(String action) {
        return null;
    }
}

