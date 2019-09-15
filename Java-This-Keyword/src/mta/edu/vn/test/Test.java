package mta.edu.vn.test;

/**
 * This Keyword
 *
 * 1. This can be used to refer current class instance variable
 * 2. This can be used to invoke current class method (implicitly) (ngụ ý)
 * 3. This() can be used to invoke current class contructor
 * 4. This can be passed as argument in the method call
 * 5. This can be passed as an argument in the constructor call
 * 6. This can be used to return the current class instance from the method
 *
 */

public class Test {
    public static void main(String [] args){
        System.err.println("Hello...");
        String str1 = "Welcome";
        String str2 = "Welcome";
        System.err.println(str1 == str2);

        String str3 = new String("Hello");
        String str4 = new String("Hello");
        String str5 = str1.intern();
        int check = str3.compareTo(str4);
        System.out.println("str1 == str3 : " + (str1 == str3));
        System.out.println("str5.equals(str3) : " + str5.equals(str3));
        System.err.println("str5 == str3 : " + (str5 == str3));
        System.err.println("str1.equals(str3) : " + str1.equals(str3));
        System.out.println("str3 == str4 : " + (str3 == str4));
        System.out.println("str3.intern() == str4.intern() : " + (str3.intern() == str4.intern()));
        System.out.println("str3.equals(str4) : " + str3.equals(str4));
        System.err.println("check = " + check);
        System.err.println(str1.hashCode() + " :: " + str3.hashCode() + " :: " + str4.hashCode());

    }
}
