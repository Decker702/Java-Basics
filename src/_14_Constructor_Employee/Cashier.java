package _14_Constructor_Employee;

public class Cashier extends Employee {
	
//public Cashier(String name, double salary, int startYear, int birthYear) {
	//	super(name, salary, startYear, birthYear);
	// TODO Auto-generated constructor stub
//	}

	public String location;
	
	public Cashier (String name, double salary, int startYear, int birthYear, String location) {
		super(name, salary, startYear, birthYear);
		this.location = location;			
	}
}
