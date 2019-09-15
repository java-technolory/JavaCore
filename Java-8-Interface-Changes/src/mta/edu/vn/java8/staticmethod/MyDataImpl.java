package mta.edu.vn.java8.staticmethod;

public class MyDataImpl implements MyData {

    public static void main(String [] args){
        MyDataImpl obj = new MyDataImpl();
        obj.print("");
        obj.isNull("abc");
    }

    public boolean isNull(String str) {
        System.err.println("Impl Null Check");
        return str == null ? true : false;
    }

//    @Override
//    public void print(String str) {
//
//    }

    @Override
    public void hello() {

    }
}
