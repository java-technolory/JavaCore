package mta.edu.vn.gennerics.classs;

import java.io.Externalizable;
import java.io.InputStream;
import java.io.Serializable;
import java.util.List;

public class GenericBoundedTypeParameters {

    // determines the largest of three Comparable object
    // Trường hợp extends với class vs interface thì class phải được đặt trước interface

    /***
     *  // true
     *  [ ở đây Number là class nên cần đặt trước Comparable là interface ư
     *  public static <T extends Number & Comparable<T>> T maximum(T x, T y, T z);
     *
     *  // false
     *  [ ở đây Comparable là interface phải đặt sau class Number vì vậy sẽ error comple!]
     *  public static <T extends Comparable<T> & Number> T maximum(T x, T y, T z);
     *
     */

    public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
        T max = x;  // assume x is initially largest [giả xử x ban đầu là lớn nhất]
        if (y.compareTo(max) > 0) {
            max = y;
        }

        if (z.compareTo(max) > 0) {
            max = z;
        }
        return max;
    }

    public static <T extends InputStream> void read(final T tream) {
        // some implementation here ...
    }

/*
    public static <T super InputStream> void a(T a){

    }
*/

    public static <T extends Serializable> void store(final T object) {
        // some implementation here ...
    }


    public <T,J extends T> void action(final T inital, final J next){
        // some implementation here ...
    }

    public static <T extends InputStream & Serializable> void storeToRead(final T stream){
        // some implementation here ...
    }

    public static <T extends Serializable & Externalizable & Cloneable> void persist(final  T stream){
        // some implementation here ...
    }



    public static void main(String[] args) {
        System.out.printf("Max of %d, %d and %d is %d\n\n", 3, 4, 5, maximum(3, 4, 5));
        System.out.printf("Max of %.1f, %.1f and %.1f is %.1f\n\n", 6.6, 8.8, 7.7, maximum(6.6, 8.8, 7.7));
        System.out.printf("Max of %s, %s and %s is %s", "apple", "orange", "pear", maximum("apple", "orange", "pear"));
    }

}
