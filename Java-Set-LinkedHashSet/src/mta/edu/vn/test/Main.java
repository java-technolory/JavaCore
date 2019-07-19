package mta.edu.vn.test;

import mta.edu.vn.model.Person;

import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String [] args){
        Set<Person> set = new LinkedHashSet<>();
        set.add(new Person(1,"A"));
        set.add(new Person(2,"B"));
        set.add(new Person(3,"C"));
        set.add(new Person(4,"A"));

        System.out.println("Before remove ...");
        for(Person p : set){
            System.out.println(p.getId() + " :: " + p.getName());
        }

        set.remove(new Person(1,"A"));

        System.out.println("After remove ...");
        for(Person p : set){
            System.out.println(p.getId() + " :: " + p.getName());
        }
    }
}
