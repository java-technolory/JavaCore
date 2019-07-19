package mta.edu.vn.test;

import mta.edu.vn.model.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String [] args){
        List<Person> list = new ArrayList<>();
        list.add(new Person(1,"A"));
        list.add(new Person(4,"D"));
        list.add(new Person(3,"C"));
        list.add(new Person(7,"G"));
        list.add(new Person(5,"E"));
        list.add(new Person(2,"B"));
        list.add(new Person(6,"F"));

        System.err.println("Before sort list");
        for (Person p : list){
            System.out.println(p.getId() + " :: " + p.getName());
        }

/*        Collections.sort(list, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if(o1.getId() > o2.getId()){
                    return -1;
                } else if(o1.getId() < o2.getId()){
                    return 1;
                } else {
                    return 0;
                }
            }
        });*/

        Collections.sort(list,new MyComparator());
        System.err.println("After sort list");
        for (Person p : list){
            System.out.println(p.getId() + " :: " + p.getName());
        }

    }

    static class MyComparator implements Comparator<Person>{

        @Override
        public int compare(Person o1, Person o2) {
/*            if(o1.getId() > o2.getId()){
                return 1;
            } else if(o1.getId() < o2.getId()){
                return -1;
            } else {
                return 0;
            }
            */
            return -(o1.getName().compareTo(o2.getName()));
        }
    }
}
