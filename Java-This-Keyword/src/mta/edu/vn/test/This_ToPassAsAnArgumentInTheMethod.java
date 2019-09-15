package mta.edu.vn.test;

class D {
    void m(D d){
        System.err.println("method is invoked");
    }

    void n(){
        m(this);
    }

}

public class This_ToPassAsAnArgumentInTheMethod {
    public static void main(String [] args){
        D d = new D();
        d.n();
    }
}
