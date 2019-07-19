package mta.edu.vn.test;

class Animal2 {
    Animal2(){
        System.err.println("animal is created");
    }

    Animal2(int x){
        System.err.println("x = " + x + " - Animal");
    }
}

class Dog2 extends Animal2{
    Dog2(){
        super();  // trường hợp: không sử dụng từ khóa super() thì compiler sẽ tự động gọi constructor của class cha.
        System.out.println("dog is created");
    }

    Dog2(int x){
        super(x);
    }
}

public class Super_ToInvokeParentClassContructor {
    public static void main(String [] args){
        Dog2 dog2 = new Dog2();
        Dog2 dog21 = new Dog2(10);
    }
}
