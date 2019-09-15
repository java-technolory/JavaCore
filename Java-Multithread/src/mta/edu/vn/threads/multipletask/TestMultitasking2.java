
package mta.edu.vn.threads.multipletask;

interface a{
    String a = "av";
}

class B {

    public B(){
        this((byte) 4);
    }

    public B (byte var){
        System.out.println(var);
    }
}

public class TestMultitasking2 implements Runnable {


    static {
        System.out.println("static");
    }

    {
        System.out.println("Block");
    }

    TestMultitasking2 (){
        System.out.println("constructor");
    }

    @Override
    public  void run() {
        System.out.println("task one");
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new TestMultitasking2());
        Thread t2 = new Thread(new TestMultitasking2());
        Thread t3 = new Thread(new TestMultitasking2());
        double a = 1;
        t1.start();
        t2.start();
        t3.start();
        System.out.println(12>>2);
//        String array = "abcdef";
//        for (int i = 0; i < 4; i++){
//            System.out.println(array[i]);
//        }
    }
}
