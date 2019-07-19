package com.mta.edu.example;


@Excel(name = "Cat")
public class Cat extends Animal implements Say {

    // Public fields;
    public static final String SAY = "Meo meo";
    public static final int NUMBER_OF_LEGS = 4;

    // Private fields
    @ExcelColumn(index = 0, title = "Name")
    private String name;

    @ExcelColumn(index = 1, title = "Age")
    private int age;

    // Constructor
    public Cat() {

    }

    public Cat(String name) {
        this.name = name;
        this.age = 1;
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int getNumberOfLegs() {
        return NUMBER_OF_LEGS;
    }

    @Override
    public String say() {
        return SAY;
    }

    // Private Method
    private void setName(String name) {
        this.name = name;
    }

    // Getters and setters
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
