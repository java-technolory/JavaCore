package mta.edu.vn.gennerics.classs;

import java.util.ArrayList;
import java.util.List;

public class LowerBoundedWildcards {

    public static void addCat(List<? super Cat> catList){
//        catList.add(new Cat("Meo"));
        for (Object obj : catList){
            System.out.println(((Cat)obj).getName());
        }
        System.out.println("Cat Added!");
    }

    public static void getAll(List<?> list){
        for (Object obj : list){
            System.out.println(obj + " ");
        }
    }

    // chỉ cho phép get() các objct của Cat hoặc con của Cat (RedCat)
    public static void getRedCat(List<? extends Cat> cats){
        System.out.println("Cat ...");
    }

/*
    public static void add(List<?> list){
        list.add()
    }
*/

    public static void main(String [] args){
        Cat cat = new Cat("Meo");
        List<Animal> animalList = new ArrayList<>();
        List<Cat> catList = new ArrayList<>();
        List<RedCat> redCatList = new ArrayList<>();
        List<Dog> dogList = new ArrayList<>();

        // add list of super class Animal of Cat class
        animalList.add(cat);
        addCat(animalList);
        getAll(animalList);

        // add list of class Cat
        catList.add(cat);
        addCat(catList);
        getAll(catList);

/*
        // compile time error.
        // can not add list of subclass RedCat of Cat class
        addCat(redCatList);
*/

/*
        // compile time error
        // can not add list of subclass Dog of SuperClass Animal of Cat class
        addCat(dogList);
*/

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        // obj of Cat class
        getRedCat(catList);

        // subclass of Cat
        getRedCat(redCatList);

/*
        // chỉ get() được với subclass của Cat còn Animal là super class của Cat
        getRedCat(animalList);

        getRedCat(dogList);
*/

    }

}

class Animal {}

class Cat extends Animal {
    private String name;

    public Cat(String name){
        this.name = name;
    }

    public Cat(){

    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}

class RedCat extends Cat {}

class Dog extends Animal {}

