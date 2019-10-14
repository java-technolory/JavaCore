package mta.edu.vn.array;

import java.util.HashMap;
import java.util.Map;

public class CountElement {
    public static void main(String[] args) {
//        Map<Integer, Integer> map = new HashMap<>();
//        map.put(0, 0);
//        for (Map.Entry m : map.entrySet()) {
//            System.out.println(m.getKey() + ": " + m.getValue());
//        }

        int[] a = {1, 2, 2, 3, 3, 3};
        Map<Integer, Integer> map = new HashMap();
        map.put(1, 0);
//        System.out.println(map.get(1) + 1);
        for (int i = 0; i < a.length; i++) {
            System.err.println(a[i]);
            map.put(a[i], map.get(a[i]) + 1);
            System.out.println(map.get(a[i]) + 1);
        }

        for (Map.Entry m : map.entrySet()) {
            System.out.println("Phan tu " + m.getKey() + " xuat hien " + m.getValue() + " lan ...");
        }
    }
}
