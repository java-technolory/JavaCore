package mta.edu.vn.gennerics.classs;

public class GenericSort {
    public static <T extends Comparable<T>> int sort(T obj1, T obj2) {
        int check = 0;
        if (obj1.compareTo(obj2) > 0) {
            check = 1;
        } else if (obj1.compareTo(obj2) < 0) {
            check = -1;
        } else {
            check = 0;
        }
        return check;
    }
}
