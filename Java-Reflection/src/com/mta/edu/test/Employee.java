package com.mta.edu.test;

public class Employee {

    private int id;
    private String name;
    private String address;
    private String phone;
    private String email;

    public Employee() {
        System.out.printf("Contructor Employee");
    }

    public Employee(int id) {
        this.id = id;
    }

    public Employee(int id, String name) {
        this(id);
        this.name = name;
    }

    public Employee(int id, String name, String address) {
        this(id, name);
        this.address = address;
    }

    public Employee(int id, String name, String address, String email) {
        this(id, name, address);
        this.email = email;
    }

    public Employee Employee() {
        System.out.printf("\nHello ...\n");
        return new Employee();
    }


    public static void main(int b, int c) {

    }

    public void main(int a) {

    }

    public static void main(String[] args) {
        Employee e = new Employee();
        e.Employee();
    }
}
