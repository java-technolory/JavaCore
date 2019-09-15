package mta.edu.vn.gennerics.methods;

import java.util.Collection;

public abstract class GenericMethodOne {

    public <T,R> R performActionOne(final T action){
        final R result = null;
        // Implementation here ...
        return result;
    }

    protected abstract <T,R> R performActionTwo(final Collection<T> action);

    static <T,R> R performActionThree(final Collection<T> action){
        final R result = null;
        return result;
    }
}
