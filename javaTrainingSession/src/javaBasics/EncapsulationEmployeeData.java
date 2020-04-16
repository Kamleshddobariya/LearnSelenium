package javaBasics;

public class EncapsulationEmployeeData {

	// how to implement Encapsulation(also call data hiding)
	// It is part of OOPs concept
	
	// 1. private data variables: so that these vars can not be access directly from
	// outside the class

	private int ssn;
	private String empName;
	private int empAge;

	public static void main(String[] args) {

		EncapsulationEmployeeData obj = new EncapsulationEmployeeData();

		obj.setEmpName("Manoj Patel");
		obj.setEmpAge(25);
		obj.setSsn(123524);

		System.out.println("Employee Name is: " + obj.getEmpName());
		System.out.println("Employee Age is: " + obj.getEmpAge());
		System.out.println("Employee Ssn number is: " + obj.getSsn());

	}

	// 2. getter and setter methods:
	// getter and setter method should be set as public so that we can access them
	// from outside of the class

	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName; // this make it local variable
	}

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

}
