package mta.edu.vn.test;

import mta.edu.vn.data.DataKey;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashingTest {

    {
        System.err.println("hello ...");
    }

    HashingTest(){
        System.err.println("Contructor ...");
    }

    public static void main(String [] args){

        HashingTest h = new HashingTest();

        Map<DataKey,Integer> hm = getAllData();
        DataKey dk = new DataKey();
        dk.setId(1);
        dk.setName("Phan");
        System.out.println(dk.hashCode());

        Integer value = hm.get(dk);
        System.out.println(value);

        System.out.println(" ... :: " + Objects.hash(dk));
    }

    private static Map<DataKey,Integer> getAllData(){
        Map<DataKey,Integer> hm = new HashMap<>();

        DataKey dk = new DataKey();
        dk.setId(1);
        dk.setName("Phan");
        System.out.println(dk.hashCode() + " :: " + Objects.hash(dk));
        hm.put(dk,10);
        return hm;
    }
}
