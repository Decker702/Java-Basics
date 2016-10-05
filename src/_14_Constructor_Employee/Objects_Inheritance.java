package _14_Constructor_Employee;

public class Objects_Inheritance {

	public static void main(String[] args) {
	
//		Employee paul = new Employee("Paul", 100000
//			System.out.println(paul.salary);
		
		//constructor, this is a default constructor
//		Employee jenn = new Employee();
//		jenn.wholename = "Jenn"
//		Jenn.salary = 100000;
		
		
		Employee jenn = new Employee("Jenn", 1000000, 1980, 2015);
		Manager e200 = new Manager("Sydney", 30000, 1990, 2000, "Java");
	//	Cashier c345 = new Cashier ("Jon", 23000. 1989, 2014, "Front")
		
		System.out.println(jenn.salary);
		System.out.println(e200.wholename);
		System.out.println(e200.department);
//		System.out.println(c345.location);
		

		//System.out.println(jenn.salary);//You are only asking to print out the salary
	//	System.out.println(l.birthYear);
		
	
	}

}
