package mta.edu.vn.gennerics.methods;

public class GenericMethodTwo<T> {

    // Constructor use Generic
    public GenericMethodTwo(T initalAction){
        // Implementation here ...
    }

    public <O> GenericMethodTwo(T initalAction, O nextAction){
        // Implementation here ...
    }

    public <R> R peformAction(final T action){
        final R result = null;
        // Implementaion here ...
        return result;
    }

/*    public <@Actionable> R peformActionOne(final T action){
        final R result = null;

        return result;
    }*/

//    public< @Actionable T > void performAction( final T action ) {
//        // Some implementation here
//    }

    public <R,U> R performAction(final U action){
        R result = null;
        // Implementation here ...
        return result;
    }
}
