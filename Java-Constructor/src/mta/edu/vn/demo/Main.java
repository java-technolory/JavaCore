package mta.edu.vn.demo;

public class Main {
    public static void main(String[] args) {
        Person p = new Person();
        long salary = p.getSalary();
        System.out.println("Salary = " + salary);
        System.err.println("Salary = " + salary);
    }
}
