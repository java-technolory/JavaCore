package mta.edu.vn.gennerics.methods;

import mta.edu.vn.gennerics.classs.GenericsType;

public class GenericsMethod {

    // Java Genneric Method
    public static <D> boolean isEqual(GenericsType<D> g1, GenericsType<D> g2){
        return g1.getT().equals(g2.getT());
    }

    public static <T> boolean isCheck(GenericsType<T> g1, GenericsType<T> g2){
        return g1.getT().equals(g2.getT());
    }

    public static <T extends Comparable<T>> int compare(T t1, T t2){
        return t1.compareTo(t2);
    }

    public static void main(String [] args){
        GenericsType<String> g1 = new GenericsType<>();
        g1.setT("Phan");

        GenericsType<String> g2 = new GenericsType<>();
        g2.setT("Phan");

        // c1
        boolean is = GenericsMethod.isEqual(g1,g2);

        // c2
        boolean check = GenericsMethod.<String>isCheck(g1,g2);

        System.out.println("is = " + is + " && check = " + check);
    }
}
