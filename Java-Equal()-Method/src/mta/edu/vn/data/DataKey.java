package mta.edu.vn.data;

public class DataKey {
    private int id;
    private String name;

    public DataKey() {
    }

    public DataKey(int id, String name) {
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
    public String toString() {
        return "DataKey [id = " + id + ", name = " + name + " ]";
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("equal(...) ...");
        if(obj instanceof DataKey){
            System.out.println("equal(true) ...");
            return true;
        } else {
            System.out.println("equal(false) ...");
            return false;
        }
    }

    @Override
    public int hashCode() {
        System.out.println("hash code ...");
        return this.id * this.name.hashCode();
    }
}
