package mta.edu.vn.java8.defaultmethod;

interface Vehicle {
    default void print() {
        System.out.println("I am a vehicle!");
    }

    default void blowHorn(){
        System.out.println("Blowing horn!");
    }
}

interface FourWheeler {
    default void print() {
        System.out.println("I am a four wheeler!");
    }
}

class Car implements Vehicle, FourWheeler {
    //Trường hợp: nếu class implement nhiều interface mà trong interface có cùng method giống nhau thì
    //khi đó complier sẽ yêu cầu overide một method khi đó complier sẽ xác định overide của interface nào.
    @Override
    public void print() {
        Vehicle.super.print();
        Vehicle.super.blowHorn();
        FourWheeler.super.print();
    }

}

public class DefaultMethodExample01 {
    public static void main(String[] args) {
        Vehicle v = new Car();
        v.print();
    }
}
