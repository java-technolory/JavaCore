package mta.edu.vn.constructor;

import java.util.ArrayList;
import java.util.List;

public class CopyConstructor {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Mango");
        list.add("Orange");

        Fruits fruits = new Fruits(list);

        System.out.println("List Fruits = " + fruits.getFruitsList());

        Fruits fCopy = fruits;
        fCopy.getFruitsList().add("Apple");
        System.out.println(".... = " + fruits.getFruitsList());
        System.out.println("List Fruits Copy = " + fCopy.getFruitsList());

/*
        fCopy = new Fruits(fruits);
        fCopy.getFruitsList().add("Banana");
        System.out.println("===> Fruits = " + fruits.getFruitsList());
        System.out.println("===> Fruit Copy = " + fCopy.getFruitsList());

*/
    }
}
