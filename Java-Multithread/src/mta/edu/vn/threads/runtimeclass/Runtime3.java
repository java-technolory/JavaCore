package mta.edu.vn.threads.runtimeclass;

public class Runtime3 {
    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        System.out.println("Total memory: " + r.totalMemory());
        System.out.println("Free memory: " + r.freeMemory());

        for (int i = 0; i < 10000; i++){
            new Runtime3();
        }

        System.out.println("After creating 10000 instance, Free Memory: " + r.freeMemory());
        System.gc();
        System.out.println("After gc(), Free Memory: " + r.freeMemory());
    }
}
