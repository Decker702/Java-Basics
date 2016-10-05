package _14_Constructor_Employee;

public class Employee {
	//different ways to set properties - 
	//before --public String name;  gives all access.  Change public to private String name; to restrict access
	//protected double salary;   lesson by James
	//public String name;
	//double salary;

	
	//Lesson by Paul
	public String wholename;
	double salary;
	int startYear;
	int birthYear;
	//Code blocks will be called scope
	
	
	//Constructor by James
	//A constructor is a method that has the same name as the Class itself - it builds our instances or objects of that class.
	//Applies class to the variable
	//Before -- Employee james = new Employee();  
	//Now 
	
	//Paul's comments - constructor will ALWAYs have the same name as your class.
//	Employee(String name, double salary){
//		this.wholename = name;//sets the name equal to what the user declared.
//		this.salary = salary;//this constructor give the ability to access information outside of it.
		
		
	//Now
		
		public Employee(String name, double salary, int startYear, int birthYear) {
			this.wholename = name;
			this.salary = salary;
			this.startYear = startYear;
			this.birthYear = birthYear;
		}
	}

