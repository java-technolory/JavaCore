package mta.edu.vn.threads.garbagecollection;

public class TestGrabage {
    @Deprecated
    public void finalize(){
        System.out.println("object is garbage collected");
    }

    public static void main(String[] args) {
        TestGrabage s1 = new TestGrabage();
        TestGrabage s2 = new TestGrabage();

        new TestGrabage();
//        s1 = s2;

//        s1 = null;
//        s2 = null;

        System.gc();
    }
}
