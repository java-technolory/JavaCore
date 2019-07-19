package mta.edu.vn.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

/**
 * join() Method
 *
 */

public class Java_String_Join {
    public static void main(String [] args){
        System.err.println("Hello");

        String date = String.join("/","28","07","1997");
        System.out.print(date);

        String time = String.join("12","10","10");
        System.err.println(" " + time);

        List<String> list = Arrays.asList(new String []{"Hello","World","2019"});
        List<String> array = new ArrayList<>();
        array.add("Xin");
        array.add("Chao");
        array.add("...");
        String strList = String.join(" ",list);
        String strArray = String.join(" ",array);
        System.err.println("strList = " + strList);
        System.out.println("arrayList = " + strArray);

//        String str = String.join(",",);
//        System.out.println(str);

        StringBuilder sb = new StringBuilder();
        sb.append("a");
        int first = System.identityHashCode(sb);
        System.err.println(first);
        String s = new String("a");
        int sec = System.identityHashCode(s);
        System.out.println(sec);

        StringBuilder sb1 = new StringBuilder();
        sb1.append("a");
        int thirt = System.identityHashCode(sb1);
        System.err.println(thirt);

        Pattern pattern = Pattern.compile("");

    }
}
