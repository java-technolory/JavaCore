package mta.edu.vn.gennerics.classs;

import java.util.ArrayList;
import java.util.List;

public class GuidelineForWildcardUse {

    // Upper bound wildcard
    // in category
    public static void deleteCat(List<? extends Cats> catList, Cats cats){
        catList.remove(cats);
        System.out.println("Cat Removed ...");
    }

    // Lover bound wildcard
    // out category
    public static void addCat(List<? super RedCats> catList){
        catList.add(new RedCats("Red Cat"));
        System.out.println("Cat Added!");
    }

    // Unbounded wildcard
    // using Object method toString()
    public static void printAll(List<?> list){
        for (Object obj : list){
            System.out.println(obj + " ");
        }
    }

    public static void main(String [] args){
        List<Animals> animalList = new ArrayList<>();
        List<RedCats> redCatList = new ArrayList<>();

        // add list of supper class Animal of Cat class
        addCat(animalList);

        // add lít of Cat class
        addCat(redCatList);
        addCat(redCatList);

        // print all animals
        printAll(animalList);
        printAll(redCatList);

        Cats cat = redCatList.get(0);

        // delte Cat
        deleteCat(redCatList,cat);
        printAll(redCatList);
    }

}

class Animals {
    private String name;

    Animals(String name) {
        this.name = name;
    }

    public String toString(){
        return this.name;
    }
}

class Cats extends Animals{

    Cats(String name) {
        super(name);
    }
}

class RedCats extends Cats {

    RedCats(String name) {
        super(name);
    }
}

class Dogs extends Animals{

    Dogs(String name) {
        super(name);
    }
}
