package mta.edu.vn.test;

class G {
    G getG(){
        return this;
    }

    void msg(){
        System.err.println("Hello G");
    }
}
public class This_ToReturnCurrentClassInstance {
    public static void main(String [] args){
        new G().getG().msg();
        new G().getG();
        new G().msg();
    }
}
