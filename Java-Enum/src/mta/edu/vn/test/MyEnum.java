package mta.edu.vn.test;

public enum  MyEnum {

    CAFE("cafe"),TEA("tra"),FOOD("pho");
    private String name;

    private MyEnum() {
    }

    private MyEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
