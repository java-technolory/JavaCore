package mta.edu.vn.demo;

public class Person {
    //composition has-a relationship
    private Job job;

    public Person(){
        this.job = new Job();
        job.setSalary(1000L);
    }

    public long getSalary(){
        return this.job.getSalary();
    }
}
