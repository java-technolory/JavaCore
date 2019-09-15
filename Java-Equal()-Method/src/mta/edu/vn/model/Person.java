package mta.edu.vn.model;

import java.util.Objects;

public class Person {

    private String id;
    private String fullname;

    public Person() {
    }

    public Person(String id, String fullname) {
        this.id = id;
        this.fullname = fullname;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
/*
        // khong cho override
        if(!(obj instanceof Person)){
            return false;
        }
*/
        Person person = (Person) obj;
        return Objects.equals(id, person.getId())
                && Objects.equals(this.fullname, person.getFullname());
    }
}
