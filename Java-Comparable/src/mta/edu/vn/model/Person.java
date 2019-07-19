package mta.edu.vn.model;

public class Person implements Comparable<Person> {

    private int id;
    private String name;

    public Person() {
    }

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Person o) {
/*
        if (this.id > o.getId()) {
            return -1;
        } else if (this.id < o.getId()) {
            return 1;
        } else {
            return 0;
        }
*/

/*        if(this.name.compareTo(o.getName()) > 0){
            return -1;
        } else if(this.name.compareTo(o.getName()) < 0){
            return 1;
        } else {
            return 0;
        }*/

        return -(this.name.compareTo(o.getName()));
    }
}
