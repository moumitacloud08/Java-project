package org.interview.model;

public class Employee {
	
	String name;
    String department;

    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

	@Override
	public String toString() {
		return "Employee [name=" + name + ", department=" + department + "]";
	}
    
    

}
