package mta.edu.vn.test;

class Animal1{
    void eat(){
        System.err.println("eating ...");
    }
}

class Dog1 extends Animal1 {
    @Override
    void eat() {
        System.out.println("eating bread ...");
    }

    void bark(){
        System.out.println("barking ...");
    }

    void work(){
        super.eat();
        bark();
    }
}

public class Super_ToInvokeParentClassMethod {
    public static void main(String [] args){
        Dog1 d1 = new Dog1();
        Animal1 dog1 = new Dog1();  // chỉ access đc vào các  method của lớp cha (Animal1) mà lớp con (Dog1) kết thừa và @override
        d1.work();
        d1.eat();
        dog1.eat();

    }
}
