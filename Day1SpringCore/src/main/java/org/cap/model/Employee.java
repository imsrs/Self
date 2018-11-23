package org.cap.model;

public class Employee {
	
	private int employeeId;
	private String employeeName;
	private double salary;
	private Address address;
	
	public Employee() {
		System.out.println("Employee No Arg-Constructor");
	}
	public Employee(int employeeId, String employeeName, double salary) {

		
		super();
		System.out.println("Employee 3 Arg-Constructor");
		
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
	}
	
	
	
	public Employee(int employeeId, String employeeName, double salary, Address address) {
		super();
		System.out.println("Employee 4 Arg-Constructor");
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
		this.address = address;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		System.out.println("Setter-EmployeeId");
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		System.out.println("Setter-Addrress");
		this.address = address;
	}
	
	
	public void setUp(){
		System.out.println("Employee Bean Initialized");
	}

	public void destroy_method(){
		System.out.println("Employee Bean destroyed");
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", salary=" + salary
				+ ", address=" + address + "]";
	}
	
	
	
	

}
