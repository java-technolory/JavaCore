package mta.edu.vn.wrapper;

public class WrapperExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        Integer c = 10; // boxing [ auto convert Integer => int ]

        System.out.println(a == b);
        System.out.println(a == c);  // unboxing: convert [ Integer => int ]

        int d = a + c;      // unboxing: a [Integer] => int
        System.out.println(d);

        Integer f = new Integer(10);
        Integer g = new Integer(10);
        System.out.println(f == g);
        System.out.println(f.equals(g));

    }
}
