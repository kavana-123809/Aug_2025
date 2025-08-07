package Lab3.com.cg.eis.bean;

import Lab3.com.cg.eis.Exception.EmployeeException;

public class Employee {
	 private int id;
	    private String name;
	    private double salary;
	    private String designation;
	    private String insuranceScheme;

	   
	    public Employee(int id, String name, double salary, String designation) throws EmployeeException{
	    	
	    	if(salary<3000) {
	    	throw new EmployeeException("Salary should not be less than 3000");	
	    	}
	        this.id = id;
	        this.name = name;
	        this.salary = salary;
	        this.designation = designation;
	    }

	    
	    public int getId() { return id; }
	    public String getName() { return name; }
	    public double getSalary() { return salary; }
	    public String getDesignation() { return designation; }
	    public String getInsuranceScheme() { return insuranceScheme; }

	    public void setInsuranceScheme(String insuranceScheme) {
	        this.insuranceScheme = insuranceScheme;
	    }

	    @Override
	    public String toString() {
	        return "Employee Details:\n" +
	               "-------------------\n" +
	               "ID: " + id +
	               "\nName: " + name +
	               "\nSalary: " + salary +
	               "\nDesignation: " + designation +
	               "\nInsurance Scheme: " + insuranceScheme;
	    }
}