package mta.edu.vn.test;

class Animal{
    String color = "white";
}

class Dog extends Animal {
    String color = "black";
    void printColor(){
        System.out.println("Dog :: " + color); // prints color of Dog class
        System.out.println("Animal :: " + super.color); // prints color of Animal Class
    }
}

public class Super_ToReferImmepediateParentClassInstanceVariable {
    public static void main(String [] args){
        Dog dog = new Dog();
        dog.printColor();
    }
}
