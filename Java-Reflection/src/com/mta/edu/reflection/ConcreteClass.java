package com.mta.edu.reflection;

public class ConcreteClass extends BaseClass implements BaseInterface {

    public int publicInt;

    private String privateString = "private string";

    protected boolean protectedBoolean;

    Object defaultObject;

    public ConcreteClass(int i) {
        this.publicInt = i;
    }

    public ConcreteClass(String i) {
        this.privateString = i;
    }

    public ConcreteClass() {
    }

    @Override
    public void method1() {
        System.err.println("Method1 impl.");
    }

    @Override
    public int method2(String str) {
        System.err.println("Method2 impl.");
        return 0;
    }

    @Override
    public int method4() {
        System.err.println("Method overriden.");
        return 0;
    }

    public int method5(int i){
        System.err.println("Method4 overriden.");
        return 0;
    }

    // inner classes
    public class ConcreteClassPublicClass{

    }

    private class ConcreteClassPrivateClass{

    }

    private class ConcreteClassProtectedClass{

    }

    class ConcreteClassDefaultClass{

    }

    //memeber enum
    enum ConreteClassDefaultEnum{

    }

    //memeber interface
    public interface ConcreteClassPublicInterface{
        
    }

}
