package mta.edu.vn.gennerics.classs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class GenericWildcards {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(4);
        list.add(5);
        double sum = sumNew(list);

        List<Number> a = new ArrayList<>();
        a.add(100);
        a.add(200);
        a.add(300);
        double sum1 = sumOld(a);
        System.out.println("Sum = " + sum + " && a = " + a);

        for (Object obj : list) {
            System.out.println(obj);
        }
        printData(list);
    }

    public static double sumNew(List<? extends Number> list) {
        double sum = 0;
        for (Number n : list) {
            sum += n.doubleValue();
        }
        return sum;
    }

    public static double sumOld(List<Number> list) {
        double sum = 0;
        for (Number n : list) {
            sum += n.doubleValue();
        }
        return sum;
    }

    /* Java Generic Unbounded Wildcard */
    // Similar to upper bound list, we are not allowed to add anything to the list
    // [tương tự như giới hạn trên list, chúng ta không được phép add bất kỳ vào trong list]
    public static void printData(List<?> list) {
        for (Object obj : list) {
            System.out.println(obj + " :: ");
        }
    }

    /* Java Generic Upper Bounded Wildcard */
    // chúng chỉ có thể get giá trị của list của upper bounded list (giới hạn trên)
    // ko được phép add() thêm bất kỳ phần từ nào trong intList() method ngoại trừ giá trị null
    // nếu cố tính add thêm phần từ thì sẽ bị won't complite.
    public static void intList(List<? extends Double> list) {
        Number b = null;
        list = Arrays.asList(1.0,2.0,3.0);
        for (Number n : list){
            list.add(null);
//            n.doubleValue();
        }

    }

    public static double sum(List<? extends Number> list) {
        double sum = 0.0;
        for (Number n : list) {
            sum += n.doubleValue();
        }
        return sum;
    }

    /* Java Generic Lower Bounded Wildcard */
    // Java compiler allows to add lower bound object types to the list.
    public static void addIntegers(List<? super Long> list){
        list.add(100l);
    }

    public static void doubleList(List<? extends Double> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }

}

interface MyLists<E, T> extends List<E> {

}
