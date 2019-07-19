package mta.edu.vn.gennerics.test;

import mta.edu.vn.gennerics.classs.Box;
import mta.edu.vn.gennerics.classs.BoxOne;
import mta.edu.vn.gennerics.classs.BoxTwo;

import java.util.*;

public class GenericTester {

    public static void main(String[] args) {

        Box<Integer> integerBox = new Box<>();
        Box<String> stringBox = new Box<>();
        Box<Number> numberBox = new Box<>();

        BoxOne<Integer, String> box1 = new BoxOne<>();
        BoxOne<String, String> box2 = new BoxOne<>();

        BoxTwo<Integer, List<String>> box = new BoxTwo<>();

        List<String> messages = new ArrayList<>();

        // row type
        Box<Integer> boxs = new Box<Integer>();
        boxs.add(100);

        Box rowBox = new Box();

        // No warning
        rowBox = boxs;

        // Warning for unchecked invocation to add(T);
        rowBox.add(1000);
        System.out.println(rowBox.get());

        // Warning for unchecked conversation
        boxs = rowBox;
        System.err.println(boxs.get());

        // Map<key,value>
        Map<Integer, Integer> integerMap = new HashMap<>();
        integerMap.put(1, 10);
        integerMap.put(2, 20);

        Map<String, String> stringMap = new HashMap<>();
        stringMap.put("1", "Hello World");
        stringMap.put("2", "Hi Word!");

        System.out.println(":: " + integerMap.get(1));
        System.out.println(":: " + stringMap.get("1"));

        // iterate keys.
        Iterator<Integer> integerIterator = integerMap.keySet().iterator();
        while (integerIterator.hasNext()) {
            System.out.println("... : " + integerIterator.next());
        }

        // iterate values.
        Iterator<String> stringIterator = stringMap.values().iterator();
        while (stringIterator.hasNext()) {
            System.out.println(">>> : " + stringIterator.next());
        }

        integerBox.add(100);
        stringBox.add("Hello World!");
        numberBox.add(568.0);

        box1.add(10, "Hello World");
        box2.add("message: ", "Xin chao");

        messages.add("Hello");
        messages.add("Hi");
        messages.add("How are you?");

        box.add(100, messages);

        System.out.println("Integer Value: " + integerBox.get());
        System.out.println("String Value: " + stringBox.get());
        System.out.println("Number Value : " + numberBox.get());

        System.out.println("Integer Value : " + box1.getFirst());
        System.out.println("String Value : " + box1.getSecond());
        System.out.println("String Value (box2) : " + box2.getFirst() + " :: " + box2.getSecond());

        System.out.println("Integer value :: " + box.getFirst());
        System.out.println("String value :: " + box.getSecond());

        // sum
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("sum = " + sum(integerList));

        List<Double> doubleList = Arrays.asList(1.1, 2.2, 3.3, 4.4, 5.5);
        System.out.println("sum = " + sum(doubleList));

        //
        printAll(integerList);
        printAll(doubleList);
        printAlls(integerList);
        printAlls(doubleList);
    }

    public static double sum(List<? extends Number> list) {
        double sum = 0.0;
        for (Number n : list) {
            sum += n.doubleValue();
        }
        return sum;
    }

    /*    public static<T> void printAlls(List<T> list, Class<T> clazz) throws IllegalAccessException, InstantiationException {
            T t = clazz.newInstance();
            for(T obj : list){
                System.out.println(obj + " ");
            }
        }*/

    public static <T> void printAlls(List<T> list) {
        for (T obj : list) {
            System.out.println(obj + " ");
        }
    }

    public static void printAll(List<?> list) {
        for (Object obj : list) {
            System.out.println(obj + " ");
        }
    }
}
