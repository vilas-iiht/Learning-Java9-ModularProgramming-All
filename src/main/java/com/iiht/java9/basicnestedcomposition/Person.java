package com.iiht.java9.basicnestedcomposition;

public class Person {
private String firstName;
private String lastName;
//composition has-a relationship
private Job job;
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public Job getJob() {
	return job;
}
public void setJob(Job job) {
	this.job = job;
}
	
   
public Person(){
	this.firstName="unknown";
	this.lastName="unknown";
    this.job=new Job();
    job.setSalary(1000L);
}
public long getSalary() {
    return job.getSalary();
}

public class Job {
    private String role;
    private long salary;
    private int id;
        
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
    public long getSalary() {
        return salary;
    }
    public void setSalary(long salary) {
        this.salary = salary;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    
    
}

}