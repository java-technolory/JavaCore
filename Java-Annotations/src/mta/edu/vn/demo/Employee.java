package mta.edu.vn.demo;

@Tables(name = "employee")
public class Employee {
    @Columns(name = "names")
    private String name;

    @Columns(name = "texts")
    private String text;

    public Employee() {
    }

    public Employee(String name, String text) {
        this.name = name;
        this.text = text;
    }

    @Columns(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
