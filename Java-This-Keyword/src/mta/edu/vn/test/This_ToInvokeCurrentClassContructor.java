package mta.edu.vn.test;

class B{
    public B(){
        System.err.println("hello b");
    }

    public B(int x){
        this(); // this phải đc gọi đâu tiên trong constructor.
        System.out.println("x = " + x);
    }
}

class C{
    public C(){
        this(100);
        System.out.println("hello b");
    }

    public C(int x){
        System.err.println("x = " + x);
    }
}

class Employee{
    int rollno;
    String name, cource;
    float fee;

    Employee(int rollno, String name, String cource){
        this.rollno = rollno;
        this.name = name;
        this.cource = cource;
    }

    Employee(int rollno, String name, String cource, float fee){
        this(rollno,name,cource); // reusing constructor (tái sử dụng constructor)
        this.fee = fee;
    }

    void display(){
        System.err.println(this.rollno + " - " + this.name + " - " + this.cource + " - " + this.fee);
    }
}

public class This_ToInvokeCurrentClassContructor {
    public static void main(String args []){
        B b = new B(10);
        System.out.println("============================================");
        C c = new C();
        System.out.println("============================================");
        Employee employee1 = new Employee(1,"Phan","java");
        Employee employee2 = new Employee(2,"Van","java",500f);
        employee1.display();
        employee2.display();
    }
}
