package mta.edu.vn.threads.sleep;

public class SleepMethod_01 extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 5; i++){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        SleepMethod_01 t1 = new SleepMethod_01();
        SleepMethod_01 t2 = new SleepMethod_01();
        SleepMethod_01 t3 = new SleepMethod_01();
        SleepMethod_01 t4 = new SleepMethod_01();
        SleepMethod_01 t5 = new SleepMethod_01();
        SleepMethod_01 t6 = new SleepMethod_01();
        SleepMethod_01 t7 = new SleepMethod_01();

/*
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();

*/

        // Nếu chúng gọi method run() một cách trực tiếp mà không thông qua method start() thì khi đó sẽ không
        // có context-switching (chuyển ngữ cảnh) giữa các thread khi đó vì vậy các thread lúc này sẽ được coi như
        // một object của Thread như bao đối tượng khác trong java.
        t1.run();
        t2.run();
        t3.run();
        t4.run();
        t5.run();
        t6.run();
        t7.run();
    }

}
