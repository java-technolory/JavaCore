package mta.edu.vn.gennerics.test;

import mta.edu.vn.gennerics.classs.GenericSort;
import mta.edu.vn.gennerics.model.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person(1, "Phan"));
        list.add(new Person(2, "Van"));
        list.add(new Person(3, "Hai"));

        System.out.println("Before sort list");
        for(Person p : list){
            System.out.println("Id = " + p.getId() + " && Name = " + p.getName());
        }

//        Collections.sort(list);
        System.out.println("After sort list");
        for(Person p : list){
            System.out.println("Id = " + p.getId() + " && Name = " + p.getName());
        }


    }
}
