package mta.edu.vn.test;

class Person{
    int id;
    String name;

    Person(){

    }

    Person(int id, String name){
        this.id = id;
        this.name = name;
    }
}

class Employee extends Person {

    float salary;

    Employee(int id, String name, float salary){
        super(id,name);  // reusing parent constructor ( tái sử dụng constructor cha )
        this.salary = salary;
    }

    void display(){
        System.err.println(id + " - " + super.name + " - " + this.salary);
    }
}

public class Additional {
    public static void main(String [] args){
        Employee emp = new Employee(100,"Phan Van Hai",100f);
        Employee emp1 = new Employee(200,"Phan Van Hai",100.5f);
        emp.display();
        emp1.display();
    }
}
